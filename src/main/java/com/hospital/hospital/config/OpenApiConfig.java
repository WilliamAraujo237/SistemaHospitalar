package com.hospital.hospital.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    //Link da pagina onde é gerada a documentação { http://localhost:8080/swagger-ui/index.html }
    //Link da documentação em Json { http://localhost:8080/v3/api-docs }
    @Bean
    public OpenAPI CostunisacaoOpenApi (){
        return new OpenAPI()
                .info(new Info()
                        .title("Api Hospitalar")
                        .version("v1")
                        .description("Api hospitalar para efetuar a gestão de um centro de saúde")
                        .termsOfService("https://www.youtube.com/watch?v=HmFVIups-3M")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.youtube.com/watch?v=HmFVIups-3M"))
                );
    }
}
