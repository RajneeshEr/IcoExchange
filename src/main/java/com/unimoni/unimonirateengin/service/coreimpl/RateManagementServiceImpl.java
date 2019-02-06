package com.unimoni.unimonirateengin.service.coreimpl;

import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.exception.RestExceptionHandler;
import com.unimoni.unimonirateengin.model.core.request.RateManagementReqUI;
import com.unimoni.unimonirateengin.model.core.response.RateManagementResUI;
import com.unimoni.unimonirateengin.repository.core.ProductRepository;
import com.unimoni.unimonirateengin.repository.core.RateManagementRepository;
import com.unimoni.unimonirateengin.repository.core.RateProviderRepository;
import com.unimoni.unimonirateengin.repository.core.ServiceProviderRepository;
import com.unimoni.unimonirateengin.service.core.RateManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class RateManagementServiceImpl implements RateManagementService {

    @Autowired
    private RateManagementRepository rateManagementRepository;

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    @Autowired
    private RateProviderRepository rateProviderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<RateManagementResUI> getAll() {
        List<RateManagementResUI> list=null;
        try {
            list= Collections.singletonList((RateManagementResUI) rateManagementRepository.findAll());
        } catch (Exception e) {
            System.out.println("error : in RateManagementServiceImpl class in getAll method ");
        }
        return list;
    }

    @Override
    public RateManagementResUI save(RateManagementReqUI rateManagementReqUI) {

        RateManagementResUI rateManagementResUI=null;
        RateManagement rateManagement=new RateManagement(rateManagementReqUI);

        if (rateManagementReqUI.isManual()){
            rateManagement.setRateProvider(null);
            rateManagement.setRicId(null);
            //rateManagement.setFrequency(null);
            rateManagement.setManual(true);
        }else {
            //set sp pro rateprovider  list
            // now only set one object, later modify this code for list
            rateManagement.setProduct(productRepository.findById(rateManagementReqUI.getProductID()));
            rateManagement.setRateProvider(rateProviderRepository.findById(rateManagementReqUI.getRateProviderID()));
            rateManagement.setServiceProvider(serviceProviderRepository.findById(rateManagementReqUI.getServiceProviderID()));
        }

        try {
            rateManagement=rateManagementRepository.save(rateManagement);
            rateManagementResUI=new RateManagementResUI(rateManagement);
        } catch (Exception e) {
            System.out.println("error : in RateManagementServiceImpl class inside save method ");
        }
        return rateManagementResUI;
    }

    @Override
    public RateManagementResUI update(RateManagementReqUI rateManagementReqUI) {
        RateManagement management=null;
        RateManagementResUI rateManagementResUI=new RateManagementResUI();

        try {
            //management=rateManagementRepository.save(rateManagement);
        } catch (Exception e) {
            System.out.println("error : in RateManagementServiceImpl package inside update method ");
        }
        return rateManagementResUI;
    }

    @Override
    public Optional<RateManagement> findById(long id) throws EntityNotFoundException {
        Optional<RateManagement> management=rateManagementRepository.findById(id);
        if (!management.isPresent())
            throw new EntityNotFoundException("RateManagement was not found for parameters {id="+id+"}");
        return management;
    }
}