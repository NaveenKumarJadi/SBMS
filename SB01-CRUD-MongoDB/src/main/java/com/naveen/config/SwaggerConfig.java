package com.naveen.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	public OpenAPI customOpenAPI(String appDescription, String appVersion) {

		return new OpenAPI()
				.info(new io.swagger.v3.oas.models.info.Info().title("INDIA API").description("1.0.0")
						.termsOfService("appDescription"))
				.addServersItem(new Server().url("http://localhost:9090/"));
	}
}

//Swagger - UI URL:http://localhost:9090/swagger-ui/index.html
