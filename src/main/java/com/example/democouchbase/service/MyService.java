package com.example.democouchbase.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democouchbase.entity.Product;
import com.example.democouchbase.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import io.beanmother.core.ObjectMother;
import objectexplorer.MemoryMeasurer;

@Service
public class MyService {

	int TOTAL = 10;
	int ITERATIONS = 10;
	
	private final UserRepository userRepository;

	private ObjectMother objectMother = ObjectMother.getInstance();
	
    @Autowired
    public MyService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteAll() {
    	userRepository.deleteAll();
    }
    
    public String serialize(Object obj, boolean pretty) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        if (pretty) {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        }
        return mapper.writeValueAsString(obj);
    }
    
    public void doWork() throws JsonProcessingException {
    	
    	Product productBig = objectMother.bear("productBig", Product.class);
    	String content = serialize(productBig, false);
    	try {
			Files.write(Paths.get("/home/jose/Escritorio/json.txt"), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	int ITERATIONS = 10;
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		long start = System.nanoTime();
    		Product product = objectMother.bear("productSmall", Product.class);
    		long memory = MemoryMeasurer.measureBytes(product)/1024;
    		System.out.println("--- BeanMother --->"+(System.nanoTime()-start)/1000000+"ms --- "+memory+"kb");

    		start = System.nanoTime();
    		product = userRepository.save(product);
    		System.out.println("--- Couchbase --->"+(System.nanoTime()-start)/1000000+"ms --- "+memory+"kb");
    	}    	
    }    
    
    public void doWorkBig_insert(Product productBig) {
    	for (int i = 0; i < TOTAL; i++) {
    		productBig.setId(i);
	    	long memory = MemoryMeasurer.measureBytes(productBig)/1024;
	    	System.out.println("Memoria: "+memory+"kb");
	    	
	    	userRepository.save(productBig);
    	}
    }
    
    public void doWorkBig_query() {
    	for (int i = 0; i < TOTAL; i++) {
    		Product p = userRepository.findOne(Integer.toString(i));
    		System.out.println(p.getId());
		}
    }
    	
    public void doWorkSmall_insert(Product productSmall) {
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		productSmall.setId(i);
	    	long memory = MemoryMeasurer.measureBytes(productSmall)/1024;
	    	System.out.println("Memoria: "+memory+"kb");
    		
    		userRepository.save(productSmall);			
    	}
    }
    
    public void doWorkSmall_query() {
    	for (int i = 0; i < ITERATIONS * TOTAL; i++) {
    		Product p = userRepository.findOne(Integer.toString(i));
    		System.out.println(p.getId());
		}
    }
    
}
