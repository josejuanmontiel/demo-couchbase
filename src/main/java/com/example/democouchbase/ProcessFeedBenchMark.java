package com.example.democouchbase;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
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

import com.example.democouchbase.entity.Product;
import com.example.democouchbase.service.MyService;
import com.example.democouchbase.service.MyServiceNative;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.beanmother.core.ObjectMother;

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
    private MyServiceNative serviceNative;
    
    @Setup (Level.Trial) 
    public synchronized void  initialize() {
        try {
            String args = "";
            if(context == null) {
                context = SpringApplication.run(DemoCouchbaseApplication.class, args );
            }
            service = context.getBean(MyService.class);
            serviceNative = context.getBean(MyServiceNative.class);
            serviceNative.openConnection();
            
//            service.deleteAll();
//            System.out.println(service);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String serialize(Object obj, boolean pretty) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        if (pretty) {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        }
        return mapper.writeValueAsString(obj);
    }

    @State(Scope.Thread)
    public static class MyState {
    	ObjectMother objectMother = ObjectMother.getInstance();
        Product productBig = objectMother.bear("productBig", Product.class);
        Product productSmall = objectMother.bear("productSmall", Product.class);
        String[] productArrayBig = {"","","","","","","","","",""};
        public MyState() {
        	try {
				String productBigString = serialize(productBig,false);
				productArrayBig[0]=productBigString;
				productArrayBig[1]=productBigString;
				productArrayBig[2]=productBigString;
				productArrayBig[3]=productBigString;
				productArrayBig[4]=productBigString;
				productArrayBig[5]=productBigString;
				productArrayBig[6]=productBigString;
				productArrayBig[7]=productBigString;
				productArrayBig[8]=productBigString;
				productArrayBig[9]=productBigString;
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
    }
    
//    @Benchmark
//    @BenchmarkMode(Mode.SingleShotTime)
//    public void benchmark1_1 (ProcessFeedBenchMark state, Blackhole bh, MyState objects) {
//    	service.doWorkBig_insert(objects.productBig);
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.SingleShotTime)
//    public void benchmark1_2 (ProcessFeedBenchMark state, Blackhole bh) {
//    	service.doWorkBig_query();
//    }
//
//    @Benchmark 
//    @BenchmarkMode(Mode.SingleShotTime)
//    public void benchmark2_1 (ProcessFeedBenchMark state, Blackhole bh, MyState objects) {
//    	service.doWorkSmall_insert(objects.productSmall);
//    }    
//
//    @Benchmark
//    @BenchmarkMode(Mode.SingleShotTime)
//    public void benchmark2_2 (ProcessFeedBenchMark state, Blackhole bh) {
//    	service.doWorkSmall_query();
//    }
    
    @Benchmark 
    @BenchmarkMode(Mode.SingleShotTime)
    public void benchmark3_1 (ProcessFeedBenchMark state, Blackhole bh, MyState objects) {
    	serviceNative.doWorkBig_insert(objects.productArrayBig);
    }    

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    public void benchmark3_2 (ProcessFeedBenchMark state, Blackhole bh) {
    	serviceNative.doWorkBig_query();
    }    

}
