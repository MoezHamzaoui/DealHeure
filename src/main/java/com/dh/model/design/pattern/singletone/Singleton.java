package com.dh.model.design.pattern.singletone;

public class Singleton {

    private Singleton() {

    }

    public static class SingletonHelper {
        public static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton instance_1 = Singleton.getInstance();
        Singleton instance_2 = Singleton.getInstance();
        Singleton instance_3 = Singleton.getInstance();
        System.out.println("Instance 1: "+ instance_1);
        System.out.println("Instance 2: "+ instance_2);
        System.out.println("Instance 2: "+ instance_3);

    }

}
