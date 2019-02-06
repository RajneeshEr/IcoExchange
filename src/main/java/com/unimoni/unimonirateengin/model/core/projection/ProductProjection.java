package com.unimoni.unimonirateengin.model.core.projection;

import com.unimoni.unimonirateengin.entity.core.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ProductProjection" , types = Product.class)
public interface ProductProjection  {
    String getCode();
    String getId();
}