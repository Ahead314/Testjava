package com.adama.progate;

import java.util.Scanner;

public class Adama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre Prenom :");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre nom :");
        String nom = scanner.nextLine();

//        System.out.println("Entrez votre Nickname(Surnom):");
//        String nickname = scanner.nextLine();
        System.out.print("Entre votre age :");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez votre ville de naissance :");
        String villeNaiss = scanner.nextLine();

        System.out.print("Entrez la ville ou vous trouvez actuellement : ");
        String localisation = scanner.nextLine();


        System.out.print("Entrez votre taille (m) : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrez votre poids :");
        double poids = scanner.nextDouble();

        System.out.print("Entrez le prenom de votre Papa :");
        String prenomPapa = scanner.nextLine();

        System.out.print("Entre le nom de votre Papa :");
        String nomPapa = scanner.nextLine();

        System.out.print("Entrez le prenom de votre Maman :");
        String prenomMaman = scanner.nextLine();

        System.out.print("Entre le nom de votre Maman :");
        String nomMaman = scanner.nextLine();

        System.out.print("Entrez le nombre de freres et soeurs :");
        int nbfraterie = scanner.nextInt();

        String name = Moi.affichePrenomNom(prenom, nom) ;
//        String nameNick      = Moi.affichePrenomNom(nickname);
        Moi.afficheInfos(name, age, villeNaiss, localisation, taille, poids, prenomPapa, nomPapa, prenomMaman, nomMaman);
        System.out.println("Mes freres et soeurs sont : ");
        FreresSoeurs freresSoeurs = new FreresSoeurs();
//        FreresSoeurs freresSoeurs2 = new FreresSoeurs();
//        FreresSoeurs freresSoeurs3 = new FreresSoeurs();
//        FreresSoeurs freresSoeurs4 = new FreresSoeurs();
//        FreresSoeurs freresSoeurs5 = new FreresSoeurs();
//        FreresSoeurs freresSoeurs6 = new FreresSoeurs();
//        FreresSoeurs freresSoeurs7 = new FreresSoeurs();

        FreresSoeurs[]  famille = new FreresSoeurs [nbfraterie];
        for (int i = 0; i < famille.length; i++) {

            System.out.println("Donnez le prenom  de votre frere ou soeur numéro " + (i+1) + " : ");
//             famille[i] = scanner.nextLine();
        }
//        famille[0]= new FreresSoeurs("Sidibé", "Kadiatou");
//        famille[1]= new FreresSoeurs("Sidibé", "Baba");
//        famille[2]= new FreresSoeurs("Fanta", "Fanta");
//        famille[3]= new FreresSoeurs("DIOP", "Ousmane");
//        famille[4]= new FreresSoeurs("DIOP", "Kabou");
//        famille[5]= new FreresSoeurs("DIOP", "Sory");
//        famille[6]= new FreresSoeurs("DIOP", "Astou");
//        famille[7]= new FreresSoeurs("DIOP", "Kadiatou");
        for (int i = 0; i < famille.length; i++) {
            famille[i].afficheTableau();

        }

//        System.out.println("Mes frères et soeurs sont :"
//                            +"\n"
//                            +freresSoeurs1.getPrenom()
//                            + " "
//                            +freresSoeurs1.getName()
//                            +"\n"
//                            +freresSoeurs2.getPrenom()
//                            +" "
//                            +freresSoeurs2.getName()
//                            +"\n"
//                            +freresSoeurs3.getPrenom()
//                            +" "
//                            +freresSoeurs3.getName()
//                            +"\n"
//                            +freresSoeurs4.getPrenom()
//                            +" "
//                            +freresSoeurs4.getName()
//                            +"\n"
//                            +freresSoeurs5.getPrenom()
//                            +" "
//                            +freresSoeurs5.getName()
//                            +"\n"
//                            +freresSoeurs6.getPrenom()
//                            +" "
//                            +freresSoeurs6.getName()
//                            +"\n"
//                            +freresSoeurs7.getPrenom()
//                            +" "
//                            +freresSoeurs7.getName());


    }
}

