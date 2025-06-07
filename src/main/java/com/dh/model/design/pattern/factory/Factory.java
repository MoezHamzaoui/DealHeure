package com.dh.model.design.pattern.factory;

public class Factory {

    public static Shape getAnimalObject(String type) {
        switch (type) {
            case "Square":
                return new Square();
            case "Triangle":
                return new Triangle();
            case "Circle":
                return new Circle();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void main (String args[]) {
        Shape shape = Factory.getAnimalObject("Circle");
        shape.draw();
    }

}
