package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.Product;
import com.unimoni.unimonirateengin.model.core.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
        List<ProductProjection> findAllProjectedBy();
        Product findById(long id);
}