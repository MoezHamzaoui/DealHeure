package com.dh.model.design.pattern.prototype;

public abstract class Form implements Cloneable {
    private String couleur;

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public Form clone() {
        try {
            return (Form) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void afficher();
}
