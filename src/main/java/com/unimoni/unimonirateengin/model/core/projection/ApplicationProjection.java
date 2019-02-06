package com.unimoni.unimonirateengin.model.core.projection;

import com.unimoni.unimonirateengin.entity.core.Application;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ApplicationProjection" , types = Application.class)
public interface ApplicationProjection {
    String getCode();
    String getId();
}