package com.wzj.config;

import com.wzj.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
