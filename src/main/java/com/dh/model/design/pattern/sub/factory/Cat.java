package com.dh.model.design.pattern.sub.factory;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("the cat Meow");
    }
}
