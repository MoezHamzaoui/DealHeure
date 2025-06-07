package com.dh.model.design.pattern.builder;

public class Car {
    private String engine;
    private int wheels;
    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
    }

    @Override
    public String toString(){
        return STR."the selected car is with \{this.engine} engine and \{this.wheels} wheels";
    }

    public static class CarBuilder {
        private String engine;
        private int wheels;




        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    public static void main(String [] args){
        Car mercedes = new CarBuilder().setWheels(4).setEngine("Mercedes").build();
        System.out.println(mercedes.toString());
    }


}
