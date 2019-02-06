package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.Currency;
import com.unimoni.unimonirateengin.model.core.projection.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CurrencyRepository extends JpaRepository<Currency,Long> {
    List<CurrencyProjection> findAllProjectedBy();
}