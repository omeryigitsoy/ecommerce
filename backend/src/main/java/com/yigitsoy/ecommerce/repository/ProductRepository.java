package com.yigitsoy.ecommerce.repository;

import com.yigitsoy.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
