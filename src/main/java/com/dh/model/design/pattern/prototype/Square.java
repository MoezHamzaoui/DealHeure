package com.dh.model.design.pattern.prototype;

public class Square extends Form {
    public int lenght;
    @Override
    public void afficher() {
        System.out.println("Square with length" + this.lenght);
    }
}
