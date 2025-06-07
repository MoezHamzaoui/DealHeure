package com.dh.model.design.pattern.method.factory;

public class DocumentWord extends Document{
    @Override
    public void createPage() {
        System.out.println("create WORD page");
    }

    @Override
    public void printPage() {
        System.out.println("print WORD page");
    }
}
