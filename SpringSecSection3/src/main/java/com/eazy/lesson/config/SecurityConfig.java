package com.eazy.lesson.config;

import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
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
	
	/*@Bean
	public InMemoryUserDetailsManager getUserDetails() {
		
		UserDetails adminUser = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("admin")
				.authorities("admin")
				.build();	
		
		UserDetails user1 = User.withDefaultPasswordEncoder()
				.username("sara")
				.password("12345")
				.authorities("read")
				.build();
		
		return new InMemoryUserDetailsManager(adminUser);
	}
	
	@Bean
	public InMemoryUserDetailsManager getUserDetails() {
		
		UserDetails adminUser = User.withUsername("admin")
				.password("admin")
				.authorities("admin")
				.build();	
		
		UserDetails user1 = User.withUsername("sara")
				.password("12345")
				.authorities("read")
				.build();
		
		return new InMemoryUserDetailsManager(adminUser);
	}
	
	@Bean
	public UserDetailsService getUserDetails(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}
	*/
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}


}
