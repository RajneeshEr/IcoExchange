package com.unimoni.unimonirateengin.service.core;

import com.unimoni.unimonirateengin.entity.core.Application;
import com.unimoni.unimonirateengin.entity.core.RateManagement;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

public interface ApplicationService {
    Optional<Application> findById(long id) throws EntityNotFoundException;
}
