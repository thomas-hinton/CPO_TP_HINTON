/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_hinton;

/**
 *
 * @author 33621
 */
public class TP2_Bieres_HINTON {

    public static void main(String[] args) {
        //Création de l'objet "uneBiere":
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();                       //Affichage de l'objet 
        //Création de l'objet "autreBiere":
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();                //Affichage de l'objet
        //Création de 3 autres bierres :
        BouteilleBiere autreBiere1 = new BouteilleBiere("Heineken", 5, "Heineken Holding");
        autreBiere1.lireEtiquette();               //Affichage de l'objet
        BouteilleBiere autreBiere2 = new BouteilleBiere("Carlsberg", 5, "Vesterbro à Copenhague");
        autreBiere2.lireEtiquette();               //Affichage de l'objet
        BouteilleBiere autreBiere3 = new BouteilleBiere( "Guinness", 4.2, "St. James's Gate");
        autreBiere3.lireEtiquette();               //Affichage de l'objet
    }
}
