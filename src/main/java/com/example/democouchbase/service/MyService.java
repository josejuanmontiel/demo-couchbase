package com.example.democouchbase.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democouchbase.entity.Product;
import com.example.democouchbase.repository.UserRepository;

import io.beanmother.core.ObjectMother;
import objectexplorer.MemoryMeasurer;

@Service
public class MyService {

	int TOTAL = 500;
	
	private final UserRepository userRepository;

	private ObjectMother objectMother = ObjectMother.getInstance();
	
    @Autowired
    public MyService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteAll() {
    	userRepository.deleteAll();
    }
    
    public void doWork() {
    	int ITERATIONS = 10;
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		long start = System.nanoTime();
    		Product product = objectMother.bear("productBig", Product.class);
    		long memory = MemoryMeasurer.measureBytes(product)/1024;
    		System.out.println("--- BeanMother --->"+(System.nanoTime()-start)/1000000+"ms --- "+memory+"kb");

    		start = System.nanoTime();
    		product = userRepository.save(product);
    		System.out.println("--- Couchbase --->"+(System.nanoTime()-start)/1000000+"ms --- "+memory+"kb");
    	}    	
    }    
    
    public void doWorkBig() {
    	for (int i = 0; i < TOTAL; i++) {
	    	Product product = objectMother.bear("productBig", Product.class);
	        product = userRepository.save(product);
    	}

    	for (int i = 0; i < TOTAL; i++) {
    		Product p = userRepository.findOne(i+"");
    	}
    
    }
    	
    public void doWorkSmall() {
    	int ITERATIONS = 10;
    	
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		Product product = objectMother.bear("productSmall", Product.class);
    		product = userRepository.save(product);			
    	}
    	
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		Product p = userRepository.findOne(i+"");
    	}
    }
    
}
