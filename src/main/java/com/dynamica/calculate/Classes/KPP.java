package com.dynamica.calculate.Classes;

public class KPP{
    private String type;
    private float liter;
    private String oilType;
    public KPP(){
    }
    public KPP(String type, float liter, String oilType){
        this.type=type;
        this.liter=liter;
        this.oilType=oilType;
    }

    public float getLiter() {
        return liter;
    }

    public String getOilType() {
        return oilType;
    }

    public String getType() {
        return type;
    }

    public void setLiter(float liter) {
        this.liter = liter;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public void setType(String type) {
        this.type = type;
    }
}

