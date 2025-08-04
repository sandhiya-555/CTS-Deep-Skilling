package org.example.jwtresponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Securityconfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/authenticate", "/test").permitAll() // allow these
                        .anyRequest().authenticated() // block others
                )
                .httpBasic(); // enable basic auth (for -u user:pwd)

        return http.build();
    }
}
