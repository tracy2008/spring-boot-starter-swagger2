package com.tracy.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableConfigurationProperties(Swagger2Properties.class)
@Configuration
@EnableSwagger2
public class Swagger2Config {

	@Autowired
	private Swagger2Properties properties;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(buildApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage(properties.getScanPackage()))
				.paths(PathSelectors.any())
				.build();

	}

	private ApiInfo buildApiInfo() {
		return new ApiInfoBuilder()
				.title(properties.getTitle())
				.description(properties.getDescription())
				.termsOfServiceUrl("http://localhost:8080/spring-boot-starter-swagger2")
				.contact(new Contact("", "", "289602252@qq.com"))
				.version(properties.getVersion())
				.build();
	}

}
