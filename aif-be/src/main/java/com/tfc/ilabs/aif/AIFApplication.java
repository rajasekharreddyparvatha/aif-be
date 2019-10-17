package com.tfc.ilabs.aif;

//import com.tfsc.ilabs.cobp.base.exception.COBPException;
//import com.tfsc.ilabs.cobp.base.util.BaseUtil;
//import com.tfsc.ilabs.cobp.base.util.ThreadLocalContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@EnableWebMvc
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AIFApplication{

    @Autowired
    private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(AIFApplication.class, args);
	}
}
