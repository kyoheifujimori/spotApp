package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

@EnableWebSecurity
@EnableMethodSecurity
public class UserSecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		//		http.authorizeHttpRequests(authz -> authz.requestMatchers("/regist").permitAll()
		//				.anyRequest().authenticated())
		//				//		springbootはデフォルトでセッション管理をしてくれるのでログイン時のセッション管理はいらない
		//
		//				.formLogin((form) -> form
		//						.defaultSuccessUrl("/react/index")
		//						.failureUrl("/login?error").permitAll())
		//				.logout((logout) -> logout
		//						.logoutUrl("/logout")
		//						.logoutSuccessUrl("/login").permitAll()
		//						//						管理していたセッションの削除をログアウト時に行う
		//						.invalidateHttpSession(true)
		//						.deleteCookies("sample.cookie"));
		return http.build();
	}

}
