package com.dh.model.design.pattern.composite;

public class Fichier implements FileDocument{
    private String name;
    public Fichier(String name){
        this.name = name;
    }
    @Override
    public void afficher(String ident) {
        System.out.println(ident +"-"+ this.name);
    }
}
