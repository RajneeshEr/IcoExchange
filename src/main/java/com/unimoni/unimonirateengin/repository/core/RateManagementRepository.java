package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.RateManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RateManagementRepository extends JpaRepository<RateManagement,Long> {
    //RateManagement findById(long id);
}

