package com.example.democouchbase.service;

import org.springframework.stereotype.Service;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

import objectexplorer.MemoryMeasurer;

@Service
public class MyServiceNative {
	
	private CouchbaseCluster cluster;
	private Bucket bucket;
	
	int TOTAL = 10;
	int ITERATIONS = 10;
	
    public void doWorkBig_insert(String [] productBig) {
    	for (int i = 0; i < productBig.length; i++) {
	    	long memory = MemoryMeasurer.measureBytes(productBig[i])/1024;
	    	System.out.println("Memoria: "+memory+"kb");
	    	
			// Create a JSON document and store it with the ID "helloworld"
			JsonObject content = JsonObject.create().put("element", productBig[i]);
			JsonDocument inserted = bucket.upsert(JsonDocument.create(i+"", content));
    	}
    }
    
    public void doWorkBig_query() {
    	for (int i = 0; i < TOTAL; i++) {
    		// Read the document and print the "hello" field
    		JsonDocument found = bucket.get(i+"");
    		System.out.println("Couchbase is the best database in the " + found.id());
		}
    }

	public void openConnection() {
		// Create a cluster reference
		cluster = CouchbaseCluster.create("127.0.0.1");
		cluster.authenticate("test", "123456");

		// Connect to the bucket and open it
		bucket = cluster.openBucket("test");		
	}
	
	public void disconnect() {
		// Close all buckets and disconnect
		cluster.disconnect();
	}

}
