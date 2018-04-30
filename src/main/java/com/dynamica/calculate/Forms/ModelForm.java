package com.dynamica.calculate.Forms;

import com.dynamica.calculate.DataClasses.Car;
import com.dynamica.calculate.DataClasses.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelForm {
    private String id;
    private String name;
    private List<Car> cars;
    public ModelForm(){
        cars=new ArrayList<>();
    }
    public ModelForm(Model model){
        id=model.getId();
        name=model.getName();
        cars=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Car> getCars() {
        return cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
