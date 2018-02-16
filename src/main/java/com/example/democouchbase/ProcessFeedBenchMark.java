package com.example.democouchbase;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.democouchbase.service.MyService;

@BenchmarkMode(Mode.Throughput) @OutputTimeUnit(TimeUnit.MINUTES)
@State(Scope.Thread)
public class ProcessFeedBenchMark   {

    public static void main(String args[]) throws Exception {
        URLClassLoader classLoader = (URLClassLoader) ProcessFeedBenchMark.class.getClassLoader();
        StringBuilder classpath = new StringBuilder();
        for(URL url : classLoader.getURLs())
            classpath.append(url.getPath()).append(File.pathSeparator);
        classpath.append("/home/jose/workspace/sandbox-tecni/demo-couchbase/src/main/resources/").append(File.pathSeparator);
        System.out.print(classpath.toString());
        System.setProperty("java.class.path", classpath.toString());

        Options opt = new OptionsBuilder()
        .include(ProcessFeedBenchMark.class.getName() + ".*")
        .timeUnit(TimeUnit.MILLISECONDS)
        .threads(1)

        .shouldFailOnError(true)
        .shouldDoGC(true)
        .build();

        new Runner(opt).run();
    }
    static ConfigurableApplicationContext context;

    private MyService service;

    @Setup (Level.Trial) 
    public synchronized void  initialize() {
        try {
            String args = "";
            if(context == null) {
                context = SpringApplication.run(DemoCouchbaseApplication.class, args );
            }
            service = context.getBean(MyService.class);
            
            service.deleteAll();
            System.out.println(service);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    public void benchmark1 (ProcessFeedBenchMark state, Blackhole bh) {
        try {
            service.doWorkBig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Benchmark 
    @BenchmarkMode(Mode.SingleShotTime)
    public void benchmark2 (ProcessFeedBenchMark state, Blackhole bh) {
        try {
            service.doWorkSmall();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
