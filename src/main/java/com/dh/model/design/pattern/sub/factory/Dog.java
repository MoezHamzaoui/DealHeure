package com.dh.model.design.pattern.sub.factory;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("the dog Bark");
    }
}
