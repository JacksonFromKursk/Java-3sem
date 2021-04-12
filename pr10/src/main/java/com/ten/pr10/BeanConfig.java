package com.ten.pr10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Lighter strong(){
        return new Lamp();
    }

    @Bean
    public Lighter king(){
        return new Firefly();
    }

    @Bean
    public Lighter weak(){
        return new Flashlight();
    }
}
