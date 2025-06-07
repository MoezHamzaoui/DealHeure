package com.dh.model.design.pattern.sub.factory;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
