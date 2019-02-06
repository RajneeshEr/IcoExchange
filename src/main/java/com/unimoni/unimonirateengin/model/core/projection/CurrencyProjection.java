package com.unimoni.unimonirateengin.model.core.projection;

import com.unimoni.unimonirateengin.entity.core.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "CurrencyProjection" , types = Currency.class)
public interface CurrencyProjection {
    String getName();
    String getId();
}