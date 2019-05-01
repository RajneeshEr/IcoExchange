package com.unimoni.unimonirateengin.service.coreimpl;

import com.unimoni.unimonirateengin.entity.core.Application;
import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.repository.core.ApplicationRepository;
import com.unimoni.unimonirateengin.service.core.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Optional<Application> findById(long id) throws EntityNotFoundException {

        Optional<Application> application=applicationRepository.findById(id);
        if (!application.isPresent())
            throw new EntityNotFoundException("Application was not found for parameters {id="+id+"}");

        return application;
    }
}
