package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.Application;
import com.unimoni.unimonirateengin.model.core.projection.ApplicationProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ApplicationRepository  extends JpaRepository<Application,Long> {
    List<ApplicationProjection> findAllProjectedBy();
}