package com.dh.model.design.pattern.prototype;

public class Client {
    public static void main (){
        Circle  c1 = new Circle();
        Circle c2 = (Circle) c1.clone();

        Square  s1 = new Square();
        Square s2 = (Square) s1.clone();

        c1.afficher();
        c2.afficher();
        s1.afficher();
        s2.afficher();

    }
}
