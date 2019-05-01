package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.entity.core.Application;
import com.unimoni.unimonirateengin.model.core.request.ApplicationReqUI;
import com.unimoni.unimonirateengin.model.core.response.ApplicationResUI;
import com.unimoni.unimonirateengin.resource.core.ApplicationResource;
import com.unimoni.unimonirateengin.service.core.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ApplicationResourceImpl implements ApplicationResource {

    @Autowired
    private ApplicationService applicationService;

    @Override
    public List<ApplicationResUI> getAll() {
        List<ApplicationResUI> applicationResUIS=new ArrayList<>();
        return applicationResUIS;
    }

    @Override
    public Optional<Application> getApplicationById(long id) throws EntityNotFoundException {
        return applicationService.findById(id);
    }

    @Override
    public ApplicationResUI save(ApplicationReqUI applicationReqUI) {
        ApplicationResUI applicationResUI=new ApplicationResUI();
        return applicationResUI;
    }

    @Override
    public ApplicationResUI update(ApplicationReqUI applicationReqUI) {
        ApplicationResUI applicationResUI=new ApplicationResUI();
        return applicationResUI;
    }

    @Override
    public String delete(ApplicationReqUI applicationReqUI) {
        return "true";
    }
}
