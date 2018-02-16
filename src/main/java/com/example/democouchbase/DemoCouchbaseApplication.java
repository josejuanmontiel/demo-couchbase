package com.example.democouchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.democouchbase.service.MyService;

@SpringBootApplication
public class DemoCouchbaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoCouchbaseApplication.class, args);
		
        MyService myService = context.getBean(MyService.class);

        myService.doWork();
//        myService.doWorkBig();
//        myService.doWorkSmall();
        
	}
}
