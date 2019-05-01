package com.unimoni.unimonirateengin.resource.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rateManagementConfig")
public interface ConfigurationData {

    @GetMapping
    Map<String, List> getConfigData();
}
