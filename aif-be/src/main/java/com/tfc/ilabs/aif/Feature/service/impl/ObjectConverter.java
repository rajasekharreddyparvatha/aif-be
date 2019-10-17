package com.tfc.ilabs.aif.Feature.service.impl;

import com.tfc.ilabs.aif.Application.model.AliasName;
import com.tfc.ilabs.aif.Application.model.Application;
import com.tfc.ilabs.aif.Application.model.ApplicationDTO;
import com.tfc.ilabs.aif.Feature.model.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rajasekhar on 21-Dec-18.
 */
public class ObjectConverter {


    static public List<Feature> toFeature(Application application, ApplicationDTO applicationDTO){
        return  applicationDTO.getFeatures().stream().map(featureDTO -> {
            Feature feature = new Feature(featureDTO.getLabel(),
                    featureDTO.getUrl(),
                    application,
                    featureDTO.getFeatureId() ,
                    null,
                    null,
                    null,
                    null);

            feature.setParams(toParams(feature, featureDTO));
            feature.setKeywords(toKeywords(feature, featureDTO));
            feature.setActions(toActions(feature, featureDTO));
            feature.setActionsExecutionFlow(toActionExecutionFlow(feature, featureDTO));
            return feature;
        }).collect(Collectors.toList());
    }
    public static List<Param> toParams(Feature feature, FeatureDTO featureDTO){
        return featureDTO.getParams().stream().map(paramDTO -> {
            return new Param(paramDTO.getParamName(), paramDTO.getParamValue(), feature);
        }).collect(Collectors.toList());
    }
    public static List<Keyword> toKeywords(Feature feature, FeatureDTO featureDTO){
        return featureDTO.getKeywords().stream().map(s -> {
            return new Keyword(s, feature);
        }).collect(Collectors.toList());
    }

    static public List<ActionsExecutionFlow> toActionExecutionFlow(Feature feature, FeatureDTO featureDTO){
        return featureDTO.getActionsExecutionFlow().stream().map(actionsExecutionFlowDTO -> {
            return new ActionsExecutionFlow(actionsExecutionFlowDTO.getOrderNum(), actionsExecutionFlowDTO.getActionName(), feature);
        }).collect(Collectors.toList());
    }
    static public List<Action> toActions(Feature feature, FeatureDTO featureDTO){
        return featureDTO.getActions().stream().map(actionDTO -> {
            return new Action(actionDTO.getActionName(), actionDTO.getActionType(), null, feature);
        }).collect(Collectors.toList());
    }


    static public List<FeatureDTO> toFeatureDTOs(Application application){
        return application.getFeatures().stream().map(feature -> {
            FeatureDTO featureDTO = new FeatureDTO(feature.getLabel(),
                    feature.getUrl(),
                    feature.getFeatureId(),
                    null,null,null, null);
            featureDTO.setParams(toParamsDTO(feature));
            featureDTO.setKeywords(toKeywordsDTO(feature));
            featureDTO.setActions(toActionDTOs(feature));
            featureDTO.setActionsExecutionFlow(actionsExecutionFlowDTOS(feature));
            return featureDTO;
        }).collect(Collectors.toList());
    }

    static public List<FeatureDTO.ActionsExecutionFlowDTO> actionsExecutionFlowDTOS(Feature feature){
        return feature.getActionsExecutionFlow().stream().map(actionsExecutionFlow -> {
            return new FeatureDTO.ActionsExecutionFlowDTO(actionsExecutionFlow.getOrderNum(), actionsExecutionFlow.getActionName());
        }).collect(Collectors.toList());
    }

    static public List<FeatureDTO.ActionDTO> toActionDTOs(Feature feature){
        return feature.getActions().stream().map(action -> {
            return new FeatureDTO.ActionDTO(action.getActionName(), action.getActionType(), action.getAction().toString());
        }).collect(Collectors.toList());
    }

    static public List<String> toKeywordsDTO(Feature feature){
        return feature.getKeywords().stream().map(keyword -> {
            return keyword.getKeyword();
        }).collect(Collectors.toList());
    }
    static public List<FeatureDTO.ParamDTO> toParamsDTO(Feature feature){
        return feature.getParams().stream().map(param -> {
            return new FeatureDTO.ParamDTO(param.getParamName(), param.getParamValue());
        }).collect(Collectors.toList());
    }
}
