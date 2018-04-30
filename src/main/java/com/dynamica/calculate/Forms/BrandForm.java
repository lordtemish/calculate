package com.dynamica.calculate.Forms;

import com.dynamica.calculate.DataClasses.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandForm {
    private String id;
    private String name;
    List<ModelForm> models;
    public BrandForm(){models=new ArrayList<>();}
    public BrandForm(Brand brand){
        id=brand.getId();
        name=brand.getName();
        models=new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModelForm> getModels() {
        return models;
    }
    public void addModel(ModelForm modelForm){
        models.add(modelForm);
    }
}
