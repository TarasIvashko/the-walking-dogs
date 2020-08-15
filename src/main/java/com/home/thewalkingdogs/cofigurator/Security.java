package com.home.thewalkingdogs.cofigurator;

import com.home.thewalkingdogs.services.UserServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
    @Autowired
  private  UserServis userServis;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("identuficacia" );
        auth.inMemoryAuthentication().withUser("u").password("u").roles("u");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("autorization" );
        http.csrf().disable().cors().disable().authorizeRequests()
                .antMatchers("/data").authenticated()
                                                                               //.anyRequest().permitAll()
                .and().httpBasic();
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
}

}
