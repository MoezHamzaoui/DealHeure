package com.dh.model.design.pattern.method.factory;

public class Client {
    public static void main(String [] args) {
        Document pdf = new DocumentPDF();
        pdf.printPage();
        Document word = new DocumentWord();
        word.printPage();
    }
}
