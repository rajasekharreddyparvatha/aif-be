package com.tfc.ilabs.aif.Feature.controller;

import com.tfc.ilabs.aif.Feature.bean.FeatureConfiguration;
import com.tfc.ilabs.aif.Feature.model.FeatureDTO;
import com.tfc.ilabs.aif.Feature.service.api.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
@Controller
public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @PostMapping("/application/{appId}/features")
    List<String> addFeatures(@PathVariable  String appId, @RequestBody List<FeatureDTO> featureDTOs){
        return featureService.addFeatures(appId, featureDTOs);
    }

    @DeleteMapping("/application/{appId}/features")
    String deleteFeatures(@PathVariable String appId){
        return featureService.deleteFeatures(appId);
    }

//    //TO-DO

//    @GetMapping("/application/{appId}/features")
//    List<FeatureDTO> getFeatures(@PathVariable String appId){
//        return featureService.getFeatures(appId);
//    }
//
//    @PostMapping("/application/{appId}/features/{featureId}")
//    String addFeature(String appId, FeatureDTO featureDTO){
//        return featureService.addFeature(appId,featureDTO);
//    }
//
//    @GetMapping("/application/{appId}/features/{featureId}")
//    FeatureDTO getFeature(@PathVariable String appId, @PathVariable String featureId){
//        return featureService.getFeature(appId, featureId);
//    }
//
//    @DeleteMapping("/application/{appId}/features/{featureId}")
//    String deleteFeature(@PathVariable String appId, @PathVariable String featureId){
//        return featureService.deleteFeature(appId, featureId);
//    }
//
//    @PutMapping("/application/{appId}/features/{featureId}")
//    String updateFeature(String appId, FeatureDTO featureDTO){
//        return featureService.updateFeature(appId, featureDTO);
//    }
}
