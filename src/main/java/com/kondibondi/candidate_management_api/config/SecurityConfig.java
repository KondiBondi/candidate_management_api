//package com.kondibondi.candidate_management_api.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration(proxyBeanMethods = false)
//@EnableWebSecurity
//@Slf4j
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain htmlFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .oauth2ResourceServer(
//                        oauth2 -> oauth2.jwt(Customizer.withDefaults())
//                )
//                .authorizeHttpRequests(registry -> {
//
//                    registry.requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll();
//                    registry.requestMatchers("/actuator/**", "/actuator").permitAll();
//
//                    registry.requestMatchers(HttpMethod.GET, "/sth/sth*").hasAnyAuthority(ADMIN, USER_ADMIN);
//                    registry.requestMatchers(HttpMethod.GET, "/sth*").hasAuthority(ADMIN);
//
//                })
//                .csrf(AbstractHttpConfigurer::disable)
//                .build();
//    }
//
//
//    private static final String ADMIN = "APPROLE_Admin";
//    private static final String USER_ADMIN = "APPROLE_UserAdmin";
//
//}