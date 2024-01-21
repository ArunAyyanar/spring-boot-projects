package com.eazy.lesson.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				(requests) -> requests.requestMatchers("/account", "/balance", "/cards", "/loans").authenticated());
		http.authorizeHttpRequests((requests) -> requests.requestMatchers("/contact", "/notice").permitAll());
		// http.authorizeHttpRequests(requests->requests.anyRequest().denyAll()); 
		// http.authorizeHttpRequests(request->request.anyRequest().permitAll());
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
		return http.build();
	}

}
