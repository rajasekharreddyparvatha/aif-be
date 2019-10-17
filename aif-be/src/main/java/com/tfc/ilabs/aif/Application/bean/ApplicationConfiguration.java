package com.tfc.ilabs.aif.Application.bean;

import com.tfc.ilabs.aif.Application.service.api.ApplicationService;
import com.tfc.ilabs.aif.Application.service.impl.ApplicationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public ApplicationService applicationService(){
        return new ApplicationServiceImpl();
    }
}
