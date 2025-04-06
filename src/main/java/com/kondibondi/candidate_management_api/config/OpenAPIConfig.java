package com.kondibondi.candidate_management_api.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(title = "CM_API Documentation", version = "0.1", description = "A service to manage recurtment process",
        license = @License(name = "KondiBondi Intellectual Property"),
        contact = @io.swagger.v3.oas.annotations.info.Contact(name = "KondiBondi")))
//@SecurityScheme(
//        name = "bearerAuth",
//        type = SecuritySchemeType.HTTP,
//        bearerFormat = "JWT",
//        scheme = "bearer"
//)
public class OpenAPIConfig {
}
