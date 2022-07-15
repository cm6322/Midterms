package com.example.midterms;

public class Pipe {
    String brand;
    double diameter;

    public Pipe(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    // TODO Milestone 1: Fix spPipe adapter.
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


}
