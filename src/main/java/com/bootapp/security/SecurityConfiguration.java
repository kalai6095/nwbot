package com.bootapp.security;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login")
                .defaultSuccessUrl("/").failureUrl("/login?error").permitAll().and().logout()
                .logoutSuccessUrl("/login?logout").invalidateHttpSession(true).clearAuthentication(true).permitAll()
                .and().exceptionHandling().accessDeniedPage("/errors/AccessDeniedPage").and().sessionManagement()
                .sessionFixation().newSession().and().sessionManagement().maximumSessions(1)
                .maxSessionsPreventsLogin(false).expiredUrl("/login?expired");
        http.headers().disable();
        http.csrf().disable();
        http.rememberMe().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("kalai").password("kalai").authorities("ROLE_ADMIN","ROLE_USER").and()
                .withUser("user1").password("user1").authorities("ROLE_USER");
    }
}
