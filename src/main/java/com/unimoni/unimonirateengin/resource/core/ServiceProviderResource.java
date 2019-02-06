package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.model.core.request.ServiceProviderReqUI;
import com.unimoni.unimonirateengin.model.core.response.ServiceProviderResUI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serviceProvider")
public interface ServiceProviderResource {
    @GetMapping
    List<ServiceProviderResUI> getAll();

    @PostMapping
    ServiceProviderResUI save(@RequestBody ServiceProviderReqUI serviceProviderReqUI);

    @PutMapping
    ServiceProviderResUI update(@RequestBody ServiceProviderReqUI serviceProviderReqUI);

    @DeleteMapping
    String delete(@RequestBody ServiceProviderReqUI serviceProviderReqUI);
}
