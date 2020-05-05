package com.company;

public class EclectusParrot extends Eclectus {

    private String species;
    private String name;
    private String featherColor;
    private int wingspan;
    private String beakColor;
    private String beakShape;
    private int bodyLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }

    public String getBeakShape() {
        return beakShape;
    }

    public void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public EclectusParrot(String species, String name, String featherColor, int wingspan, String beakColor, String beakShape, int bodyLength) {
        this.species = species;
        this.name = name;
        this.featherColor = featherColor;
        this.wingspan = wingspan;
        this.beakColor = beakColor;
        this.beakShape = beakShape;
        this.bodyLength = bodyLength;
    }
}
