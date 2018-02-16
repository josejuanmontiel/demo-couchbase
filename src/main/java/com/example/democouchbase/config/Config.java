package com.example.democouchbase.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;

@Configuration
@EnableCouchbaseRepositories
public class Config extends AbstractCouchbaseConfiguration {

	@Override
	protected List<String> getBootstrapHosts() {
		return Arrays.asList("localhost");
	}

	@Override
	protected String getBucketName() {
		return "test";
	}

	@Override
	protected String getBucketPassword() {
		return "123456";
	}
}