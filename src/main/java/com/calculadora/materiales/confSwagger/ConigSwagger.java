package com.calculadora.materiales.confSwagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConigSwagger {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Calculadora de Materiales")
                        .version("1.0.0")
                        .description("Esta API permite gestionar materiales de construcción y calcular costos.")
                        .contact(new Contact()
                                .name("Paul Alejandro Ballesteros Villacrés")
                                .email("tu-correo@ejemplo.com")
                                .url("https://github.com/paulalejo/Calculadora-Construccion"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT"))
                );
    }
}

