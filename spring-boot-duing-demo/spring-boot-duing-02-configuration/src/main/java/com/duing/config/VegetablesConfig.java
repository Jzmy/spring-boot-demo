package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public VegetablesConfig(String potato, String eggplant, String greenpeper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenpeper = greenpeper;
    }

    public VegetablesConfig() {
    }

    @Override
    public String toString() {
        return "VegetablesConfig{" +
                "potato='" + potato + '\'' +
                ", eggplant='" + eggplant + '\'' +
                ", greenpeper='" + greenpeper + '\'' +
                '}';
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
