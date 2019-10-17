package com.tfc.ilabs.aif.Feature.service.api;

import com.tfc.ilabs.aif.Feature.model.FeatureDTO;

import java.util.List;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
public interface FeatureService {

    List<String> addFeatures(String appId, List<FeatureDTO> featureDTOs);

    String deleteFeatures(String appId);

    //TO-DO

    List<FeatureDTO> getFeatures(String appId);

    String addFeature(String appId, FeatureDTO featureDTO);

    FeatureDTO getFeature(String appId, String featureId);

    String deleteFeature(String appId, String featureId);

    String updateFeature(String appId, FeatureDTO featureDTO);

}
