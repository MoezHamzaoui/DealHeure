package com.dh.model.design.pattern.singletone;

public class SingletonPattern {

    public static volatile SingletonPattern instance;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        if(instance == null){
            synchronized (SingletonPattern.class){
                if(instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return  instance;
    }

    public static void main (String [] args) {
        SingletonPattern instance_1 = SingletonPattern.getInstance();
        SingletonPattern instance_2 = SingletonPattern.getInstance();
        SingletonPattern instance_3 = SingletonPattern.getInstance();
        System.out.println("Instance 1: "+ instance_1);
        System.out.println("Instance 2: "+ instance_2);
        System.out.println("Instance 3: "+ instance_3);

    }


}
