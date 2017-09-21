package klfmediatest.jake.wineselector.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String PUBLIC_API = "/api/wine/**";
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Simple app which doesn't require extensive security so allowing all requests for now is acceptable.
		http.authorizeRequests().antMatchers(PUBLIC_API).permitAll();
	}
}
