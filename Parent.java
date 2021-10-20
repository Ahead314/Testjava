package com.adama.progate;

public class Parent {
    private  String name;
    private String prenom;
    private String numeroTelephone;

    public Parent(String name, String prenom, String numeroTelephone) {
        this.name = name;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
