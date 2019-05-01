package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.model.core.request.ServiceProviderReqUI;
import com.unimoni.unimonirateengin.model.core.response.ServiceProviderResUI;
import com.unimoni.unimonirateengin.resource.core.ServiceProviderResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceProviderResourceImpl implements ServiceProviderResource {

    @Override
    public List<ServiceProviderResUI> getAll() {
        List<ServiceProviderResUI> serviceProviderResUIS=new ArrayList<>();
        return serviceProviderResUIS;
    }

    @Override
    public ServiceProviderResUI save(ServiceProviderReqUI serviceProviderReqUI) {

        ServiceProviderResUI serviceProviderResUI=new ServiceProviderResUI();
        return serviceProviderResUI;
    }

    @Override
    public ServiceProviderResUI update(ServiceProviderReqUI serviceProviderReqUI) {
        ServiceProviderResUI serviceProviderResUI=new ServiceProviderResUI();
        return serviceProviderResUI;
    }

    @Override
    public String delete(ServiceProviderReqUI serviceProviderReqUI) {
        return "true";
    }
}
