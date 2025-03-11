package com.enviro.assessment.grad001.YingisaniHonestShivambu.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Waste Sorting API")
                        .version("1.0")
                        .description("API for managing waste categories, disposal guidelines, and recycling tips")
                        .contact(new Contact()
                                .name("Yingisani Honest Shivambu")
                                .email("yingisanihonest694@gmail.com")));
    }
}