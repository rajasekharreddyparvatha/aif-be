package com.tfc.ilabs.aif.Application.controller;

import com.tfc.ilabs.aif.Application.model.ApplicationDTO;
import com.tfc.ilabs.aif.Application.service.api.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
@RestController
public class ApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/application")
    public Map<String, String> addApplication(@RequestBody ApplicationDTO applicationDTO) {
        Map<String, String> response = new HashMap<>();
        String appId = applicationService.add(applicationDTO);
        return response;
    }

    @PutMapping("/application/{appId}")
    public Map<String, String> updateApplication(@PathVariable String appId, @RequestBody ApplicationDTO applicationDTO) {
        Map<String, String> response = new HashMap<>();
        appId = applicationService.update(applicationDTO);
        return response;
    }

    @GetMapping("/application/{appId}")
    public Map<String, String> getApplication(@PathVariable String appId) {
        Map<String, String> response = new HashMap<>();
        ApplicationDTO applicationDTO = applicationService.get(appId);
        return response;
    }

    @GetMapping("/applications")
    public List<ApplicationDTO> getApplications() {
        return applicationService.get();
    }

    @DeleteMapping("/application/{appId}")
    public Map<String, String> deleteApplication(@PathVariable String appId) {
        Map<String, String> response = new HashMap<>();
        appId = applicationService.delete(appId);
        return response;
    }

}
