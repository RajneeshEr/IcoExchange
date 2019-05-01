package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.entity.core.Application;
import com.unimoni.unimonirateengin.entity.core.RateManagement;
import com.unimoni.unimonirateengin.model.core.request.ApplicationReqUI;
import com.unimoni.unimonirateengin.model.core.response.ApplicationResUI;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/application")
public interface ApplicationResource {

    @GetMapping
    List<ApplicationResUI> getAll();

    @GetMapping("/{id}")
    Optional<Application> getApplicationById(@PathVariable long id) throws EntityNotFoundException;

    @PostMapping
    ApplicationResUI save(@RequestBody ApplicationReqUI applicationReqUI);

    @PutMapping
    ApplicationResUI update(@RequestBody ApplicationReqUI applicationReqUI);

    @DeleteMapping
    String delete(@RequestBody ApplicationReqUI applicationReqUI);

}
