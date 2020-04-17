package com.bankend.springboot;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import io.netty.handler.codec.http.HttpMethod;

@SuppressWarnings("deprecation")
@Configuration 
@EnableWebSecurity 
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
 
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean 
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider; 
	}
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http
	        .csrf()
	        .disable()
	        .headers()
	        .frameOptions()
	        .disable()
	    .and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	    .and()
	        .authorizeRequests()
	        .antMatchers("/angularfront" , "/angularfront/**").permitAll()
	    .and()
	        .authorizeRequests()
        	.anyRequest()
        	.authenticated();
		
		/*http
		.authorizeRequests()
		.antMatchers("/angularfront/" , "/angularfront/**", "http://localhost:4200" , "http://localhost:4200/**")
		.permitAll();
		
		http
			.csrf().disable()
			.authorizeRequests()
            	.anyRequest()
            	.authenticated()
            .and()
        		.httpBasic();
		
		http.cors();*/
	}
	
	@Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Collections.singletonList("*"));
        configuration.setAllowedMethods(Collections.singletonList("*"));
        configuration.setAllowCredentials(true);
        configuration.setAllowedHeaders(Collections.singletonList("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

/*	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> users = new ArrayList<UserDetails>();	
		users.add(User.withDefaultPasswordEncoder().username("hello").password("123").roles("User").build());
		
		return new InMemoryUserDetailsManager(users);
	}
*/
}
