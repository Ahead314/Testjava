package com.adama.progate;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FreresSoeurs {
    private String name;
    private String prenom;
    private int age;



    public FreresSoeurs(String name, String prenom, int age) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
    }

    public FreresSoeurs() {
    }

    public FreresSoeurs(String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
    }

    public FreresSoeurs(String prenom) {
        this.prenom = prenom;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficheTableau(){
//        for (int i = 0; i < famille.length; i++) {

//        System.out.println(Arrays.toString(famille));
        //                            +famille[i]+ " ");
        System.out.println(getName()
                            +" "
                            + getPrenom()
                            );
    }

    }
