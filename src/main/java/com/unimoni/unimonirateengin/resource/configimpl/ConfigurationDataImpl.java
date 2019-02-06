package com.unimoni.unimonirateengin.resource.configimpl;

import com.unimoni.unimonirateengin.entity.core.Product;
import com.unimoni.unimonirateengin.entity.core.RateProvider;
import com.unimoni.unimonirateengin.entity.core.ServiceProvider;
import com.unimoni.unimonirateengin.model.core.projection.ServiceProviderProjection;
import com.unimoni.unimonirateengin.repository.core.ProductRepository;
import com.unimoni.unimonirateengin.repository.core.RateProviderRepository;
import com.unimoni.unimonirateengin.repository.core.ServiceProviderRepository;
import com.unimoni.unimonirateengin.resource.config.ConfigurationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ConfigurationDataImpl implements ConfigurationData {

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RateProviderRepository rateProviderRepository;

    @Override
    public Map<String, List> getConfigData() {
        Map<String,List> stringListMap=new HashMap<>();
        stringListMap.put("serviceProviders", (List) serviceProviderRepository.findAllProjectedBy());
        stringListMap.put("rateProviders", rateProviderRepository.findAll());
        stringListMap.put("products", (List) productRepository.findAllProjectedBy());
        return stringListMap;
    }
}
