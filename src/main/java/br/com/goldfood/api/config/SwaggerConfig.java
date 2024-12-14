package br.com.goldfood.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;


/**
 * Swagger Config
 */
@Configuration
public class SwaggerConfig {
	@Bean
    OpenAPI myOpenApi() {
        return new OpenAPI().info(new Info().title("bsmb-srv-analise-comercial").version("0.0.26-SNAPSHOT")
                .contact(new Contact().name("Bradesco Seguros")).description("Microserviço do Bradesco seguros"));
    }

}
