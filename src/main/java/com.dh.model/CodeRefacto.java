package com.dh.model;

abstract class Animal {
    String name;

    String getName() {
        return this.name;
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }
}

class Cat extends Animal {

    Cat(String name) {
        this.name = name;
    }
}

class Application {

    static String getAnimalName(Animal a) {
        return a.getName();
    }
}

