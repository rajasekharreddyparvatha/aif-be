package com.tfc.ilabs.aif.Feature.bean;

import com.tfc.ilabs.aif.Feature.service.api.FeatureService;
import com.tfc.ilabs.aif.Feature.service.impl.FeatureServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rajasekhar on 20-Dec-18.
 */
@Configuration
public class FeatureConfiguration {

    @Bean
    FeatureService featureService(){
        return new FeatureServiceImpl();
    }

}
