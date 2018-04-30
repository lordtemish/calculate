package com.dynamica.calculate.Classes;

public class Freeze{
    float freezeSystem;
    String antiFreezeType;
    public Freeze(){}
    public Freeze(float freezeSystem,String antiFreezeType){
        this.antiFreezeType=antiFreezeType;
        this.freezeSystem=freezeSystem;

    }

    public float getFreezeSystem() {
        return freezeSystem;
    }

    public String getAntiFreezeType() {
        return antiFreezeType;
    }
}