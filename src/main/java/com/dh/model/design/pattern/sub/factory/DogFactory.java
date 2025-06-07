package com.dh.model.design.pattern.sub.factory;

public class DogFactory extends AnimalFactory  {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
