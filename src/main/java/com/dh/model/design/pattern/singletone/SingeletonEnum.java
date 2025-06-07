package com.dh.model.design.pattern.singletone;

public enum SingeletonEnum {
    INSTANCE;

    public void doSomething(){
        System.out.println("singleton");
    }

}

class test {
    public static void main(String[] args) {
        SingeletonEnum.INSTANCE.doSomething();
    }

}