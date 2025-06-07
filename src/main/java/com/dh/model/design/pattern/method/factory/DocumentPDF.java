package com.dh.model.design.pattern.method.factory;

public class DocumentPDF extends Document{
    @Override
    public void createPage() {
        System.out.println("create PDF page");
    }

    @Override
    public void printPage() {
        System.out.println("print PDF page");
    }
}
