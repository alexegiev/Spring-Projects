package com.luciuscode.springcoredemo.config;

import com.luciuscode.springcoredemo.common.Coach;
import com.luciuscode.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
