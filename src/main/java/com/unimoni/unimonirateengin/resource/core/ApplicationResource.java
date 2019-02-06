package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.model.core.request.ApplicationReqUI;
import com.unimoni.unimonirateengin.model.core.response.ApplicationResUI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public interface ApplicationResource {

    @GetMapping
    List<ApplicationResUI> getAll();

    @PostMapping
    ApplicationResUI save(@RequestBody ApplicationReqUI applicationReqUI);

    @PutMapping
    ApplicationResUI update(@RequestBody ApplicationReqUI applicationReqUI);

    @DeleteMapping
    String delete(@RequestBody ApplicationReqUI applicationReqUI);

}
