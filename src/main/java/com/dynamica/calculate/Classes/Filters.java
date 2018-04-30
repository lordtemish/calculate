package com.dynamica.calculate.Classes;

public class Filters{
    private String air;
    private String oilDVS;
    private String interior;
    private String fuel;
    public String KPP;
    public Filters(){}
    public Filters(String air, String oilDVS, String interior, String fuel, String KPP){
        this.air=air;this.oilDVS=oilDVS;this.interior=interior;this.fuel=fuel;this.KPP=KPP;
    }

    public String getFuel() {
        return fuel;
    }

    public String getAir() {
        return air;
    }

    public String getInterior() {
        return interior;
    }

    public String getKPP() {
        return KPP;
    }

    public String getOilDVS() {
        return oilDVS;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    public void setOilDVS(String oilDVS) {
        this.oilDVS = oilDVS;
    }
}