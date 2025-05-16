package com.naveen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.naveen.filter.AppFilter;
import com.naveen.service.CustomerService;

import static org.springframework.security.config.Customizer.withDefaults;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AppFilter filter;

	@Bean
	public BCryptPasswordEncoder pwdEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authProvider() {

		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setPasswordEncoder(pwdEncoder());
		authProvider.setUserDetailsService(customerService);

		return authProvider;
	}

	@Bean
	public AuthenticationManager authManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

//	@Bean
//	@SneakyThrows
//	public SecurityFilterChain securityConfig(HttpSecurity http) {
//
//		http.authorizeHttpRequests(req -> {
//			req.requestMatchers("/register", "/login")
//			.permitAll()
//			.anyRequest()
//			.authenticated();
//		});
//
//		return http.csrf().disable().build();
//
//	}
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/login","/api/register").permitAll()
                .and()
                .authorizeHttpRequests().requestMatchers("/api/**")
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authProvider())
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class).build();

    }
}