package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.model.core.request.RateManagementReqUI;
import com.unimoni.unimonirateengin.model.core.response.RateManagementResUI;
import com.unimoni.unimonirateengin.resource.core.RateManageResource;
import com.unimoni.unimonirateengin.service.core.RateManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Component
public class RateManageResourceImpl implements RateManageResource{

    @Autowired
    private RateManagementService rateManagementService;

    @Override
    public List<RateManagementResUI> getAll() {
        return rateManagementService.getAll();
    }

    @Override
    public Optional<RateManagement> getRateManagementById(long id) throws EntityNotFoundException {
        return rateManagementService.findById(id);
    }

    @Override
    public RateManagementResUI save(RateManagementReqUI rateManagementReqUI) {
        return rateManagementService.save(rateManagementReqUI);
    }

    @Override
    public RateManagementResUI update(RateManagementReqUI rateManagementReqUI) {
        return rateManagementService.update(rateManagementReqUI);
    }

    @Override
    public String delete(RateManagementReqUI rateManagementReqUI) {
        return null;
    }
}
