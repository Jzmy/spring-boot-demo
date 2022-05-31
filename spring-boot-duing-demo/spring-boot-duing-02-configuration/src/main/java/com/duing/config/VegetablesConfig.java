package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Data
@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;

}
