package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.ServiceProvider;
import com.unimoni.unimonirateengin.model.core.projection.ServiceProviderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Set;

@RepositoryRestResource
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {
    List<ServiceProviderProjection> findAllProjectedBy();
    ServiceProvider findById(long id);
}