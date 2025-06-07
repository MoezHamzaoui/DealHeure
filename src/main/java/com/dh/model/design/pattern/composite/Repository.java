package com.dh.model.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Repository implements FileDocument {
    private String name;
    private List<FileDocument> enfants = new ArrayList<>();
    public Repository(String name){
        this.name = name;
    }

    public void addFile(FileDocument file){
        enfants.add(file);
    }

    @Override
    public void afficher(String ident) {
        System.out.println(ident + "+ " + this.name);
        for(FileDocument file: enfants){
            file.afficher(ident+ " ");
        }
    }
}
