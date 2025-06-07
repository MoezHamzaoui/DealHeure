package com.dh.model.design.pattern.method.factory;

public abstract class Document {
    public Document(){
        createPage();
    }
    public abstract void createPage();
    public abstract void printPage();
}
