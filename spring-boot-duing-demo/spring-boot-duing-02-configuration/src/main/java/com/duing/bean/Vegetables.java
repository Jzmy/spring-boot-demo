package com.duing.bean;

public class Vegetables {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public Vegetables(String potato, String eggplant, String greenpeper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenpeper = greenpeper;
    }

    public Vegetables() {
    }

    @Override
    public String toString() {
        return "Vegetables{" +
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
