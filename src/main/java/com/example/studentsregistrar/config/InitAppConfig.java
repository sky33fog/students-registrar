package com.example.studentsregistrar.config;

import com.example.studentsregistrar.StudentsInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@Profile("init")
public class InitAppConfig {

    @Bean
    public StudentsInitializer studentsInitializer() {
        return new StudentsInitializer();
    }
}
