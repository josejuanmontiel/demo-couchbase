package com.example.democouchbase.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.CrudRepository;

import com.example.democouchbase.entity.Product;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "product")
public interface UserRepository extends CrudRepository<Product, String> {

	  List<Product> findById(String id);

}