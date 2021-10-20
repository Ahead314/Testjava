package com.adama.progate;

import java.time.LocalDate;

public class Moi {


    public Moi(String prenomPapa, String nomPapa, String prenomMaman, String nomMaman) {
        String papaPrenom = prenomPapa;
        String papaNom = nomPapa;
        String mamanPrenom= prenomMaman;
        String mamanNom = nomMaman;
    }


    public static void afficheInfos(String name, int age, String villeNais, String localisation,
                                    double taille, double poids,
                                    String prenomPapa, String nomPapa, String prenomMaman, String nomMaman) {

        System.out.println("Je m'appelle " + name);
//        System.out.println("On m'appelle aussi " + nameNick);
        System.out.println("J'ai " + age + " ans");
        int annee = LocalDate.now().minusYears(age).getYear();
        System.out.println("Je suis née en " + annee + " à " + villeNais);
        System.out.println("J'habite " + localisation);
        System.out.println("Je mesure " + taille + " mètre");
        System.out.println("Je pèse " + poids + " kilos");
        System.out.println("Mes parents sont : " + prenomPapa +" " + nomPapa+ " "+ prenomMaman + " "+ nomMaman );


        double imc = indiceMasseCorporel(taille, poids);
        System.out.println("Mon Indice de Masse corporel est de " + Math.round(imc));

        if (estCeObèse(imc)) {
            System.out.println("Vote IMC est dans les standard");
        }else{
            System.out.println("Vote IMC n'est pas dans les standard");
        }
    }


    public static String affichePrenomNom(String prenom, String nom) {
        return prenom + " " + nom;
    }

    public static String affichePrenomNom(String nickname) {
        return nickname;
    }

    public static double indiceMasseCorporel(double taille, double poids) {
        return poids /taille/taille;

    }

    public static boolean estCeObèse (double imc){
        return imc >= 18.5 && imc < 25;

    }

}
