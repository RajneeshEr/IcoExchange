package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.model.core.request.ApplicationReqUI;
import com.unimoni.unimonirateengin.model.core.response.ApplicationResUI;
import com.unimoni.unimonirateengin.resource.core.ApplicationResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationResourceImpl implements ApplicationResource {

    @Override
    public List<ApplicationResUI> getAll() {
        List<ApplicationResUI> applicationResUIS=new ArrayList<>();
        return applicationResUIS;
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
