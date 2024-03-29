package com.jcayllahua.giancarlowebcopy.api.shared.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Giancarlo Web Copy API")
                        .version("1.0")
                        .description("Giancarlo Web Copy API Documentation"));
    }
}
