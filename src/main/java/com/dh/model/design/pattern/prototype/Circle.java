package com.dh.model.design.pattern.prototype;

public class Circle extends Form {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void afficher(){
        System.out.println("the Circle with diameter "+ this.diameter);
    }
}
