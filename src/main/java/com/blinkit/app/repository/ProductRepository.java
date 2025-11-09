package com.blinkit.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.blinkit.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> { }
