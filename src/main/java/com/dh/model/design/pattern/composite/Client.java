package com.dh.model.design.pattern.composite;

public class Client {
    public static void main (String [] args) {
        Fichier document_1 = new Fichier("document_1.pdf");
        Fichier document_2 = new Fichier("document_2.word");
        Fichier document_3 = new Fichier("document_3.jpeg");
        Repository repository_1 = new Repository("Dossier_1");
        repository_1.addFile(document_1);
        Repository repository_2 = new Repository("Dossier_2");
        repository_2.addFile(document_2);
        repository_1.addFile(repository_2);
        repository_1.addFile(document_3);
        repository_1.afficher(" ");


    }
}
