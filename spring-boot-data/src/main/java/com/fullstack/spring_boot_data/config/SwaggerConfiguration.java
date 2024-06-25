package com.fullstack.spring_boot_data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfiguration {
	
    @Bean
    OpenAPI api() {
        return new OpenAPI()
        		.info(new Info()
                        .title("Movies API - Using Spring Data JPA"));
    }


}
