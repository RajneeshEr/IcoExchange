package com.unimoni.unimonirateengin.resource.core;


import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.model.core.request.RateManagementReqUI;
import com.unimoni.unimonirateengin.model.core.response.RateManagementResUI;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rateMagement")
public interface RateManageResource {
    @GetMapping
    List<RateManagementResUI> getAll();

    @GetMapping("/{id}")
    Optional<RateManagement> getRateManagementById(@PathVariable long id) throws EntityNotFoundException;

    @PostMapping
    RateManagementResUI save(@RequestBody RateManagementReqUI rateManagementReqUI);

    @PutMapping
    RateManagementResUI update(@RequestBody RateManagementReqUI rateManagementReqUI);

    @DeleteMapping
    String delete(@RequestBody RateManagementReqUI rateManagementReqUI);

}
