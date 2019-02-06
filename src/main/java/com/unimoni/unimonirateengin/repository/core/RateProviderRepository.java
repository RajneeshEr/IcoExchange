package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.RateProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RateProviderRepository extends JpaRepository<RateProvider,Long> {
    RateProvider findById(long id);

}
