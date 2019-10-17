package com.tfc.ilabs.aif.Application.service.impl;

import com.tfc.ilabs.aif.Application.model.AliasName;
import com.tfc.ilabs.aif.Application.model.Application;
import com.tfc.ilabs.aif.Application.model.ApplicationDTO;
import com.tfc.ilabs.aif.Feature.model.*;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
public class ObjectConverter {

    static public Application toApplication(ApplicationDTO applicationDTO){

        Application application = new  Application(applicationDTO.getAppId(),
                applicationDTO.getAppTitle(),
                applicationDTO.getDomain(),
                applicationDTO.getBaseURL(),
                applicationDTO.getAdminName(),
                applicationDTO.getAdminMail(),
                applicationDTO.getHomePageURL(),
                null,
                null
                );
        application.setAliasNames(toAliasNames(applicationDTO.getAliasNames(), application));
        if(applicationDTO.getFeatures().size() > 0){
            application.setFeatures(com.tfc.ilabs.aif.Feature.service.impl.ObjectConverter.toFeature(application, applicationDTO));
        }
        return application;
    }

    static public List<AliasName> toAliasNames(List<String> aliasNames, Application application){
        List<AliasName> aliases = aliasNames.stream().map(name ->{
            return  new AliasName(name, application);
        }).collect(Collectors.toList());
        return aliases;
    }

    static public List<String> toAliasNamesDTO(Application application){
        return application.getAliasNames().stream().map(aliasName -> {
            return aliasName.getAliasName();
        }).collect(Collectors.toList());
    }



    static public List<ApplicationDTO> toApplicationDTO(List<Application> applications){
        return applications.stream().map(application -> {
            ApplicationDTO applicationDTO =  new ApplicationDTO(application.getAppId(),
                    application.getAppTitle(),
                    application.getDomain(),
                    application.getBaseURL(),
                    application.getAdminName(),
                    application.getAdminMail(),
                    application.getHomePageURL(),
                    null,
                    null);
            applicationDTO.setAliasNames(toAliasNamesDTO(application));
            if(application.getFeatures().size() > 0){
                applicationDTO.setFeatures(com.tfc.ilabs.aif.Feature.service.impl.ObjectConverter.toFeatureDTOs(application));
            }
            return applicationDTO;
        }).collect(Collectors.toList());
    }
}
