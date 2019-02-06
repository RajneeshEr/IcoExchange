package com.unimoni.unimonirateengin.model.core.projection;

import com.unimoni.unimonirateengin.entity.core.ServiceProvider;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ServiceProviderProjection" , types = ServiceProvider.class)
public interface ServiceProviderProjection  {
    String getCode();
    String getId();
}