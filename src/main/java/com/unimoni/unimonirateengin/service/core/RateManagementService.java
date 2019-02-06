package com.unimoni.unimonirateengin.service.core;


import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.model.core.request.RateManagementReqUI;
import com.unimoni.unimonirateengin.model.core.response.RateManagementResUI;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public interface RateManagementService {
    List<RateManagementResUI> getAll();
    RateManagementResUI save(RateManagementReqUI rateManagementReqUI);
    RateManagementResUI update(RateManagementReqUI RateManagementReqUI);
    Optional<RateManagement> findById(long id) throws EntityNotFoundException;

}
