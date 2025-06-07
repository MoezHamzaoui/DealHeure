package com.dh.model.design.pattern.sub.factory;

public class Factory {

    public static void main (String [] args) {
        DogFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();
        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();
    }
}
