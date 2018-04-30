package com.dynamica.calculate.Classes;

public class Reductor{
    float liter;
    String type;
    public Reductor(){}
    public Reductor(float liter,String reductor){
        this.liter=liter;
        this.type=reductor;
    }

    public String getType() {
        return type;
    }

    public float getLiter() {
        return liter;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLiter(float liter) {
        this.liter = liter;
    }
}

