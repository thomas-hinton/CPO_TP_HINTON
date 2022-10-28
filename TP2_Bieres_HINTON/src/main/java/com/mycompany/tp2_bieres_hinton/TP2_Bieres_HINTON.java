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
        BouteilleBiere uneBiere = new BouteilleBiere(); //Création de l'objet uneBierre
        uneBiere.nom = "Cuvée des trolls";              //Remplissage des attributs de notre objet
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.lireEtiquette();                       //Affichage de l'objet 
        
        BouteilleBiere uneSecondeBiere = new BouteilleBiere(); //Création de maniere analogue l'objet uneSecondeBiere
        uneSecondeBiere.nom = "Leffe";                         //Remplissage des attributs de notre objet
        uneSecondeBiere.degreAlcool = 6.6;
        uneSecondeBiere.brasserie = "Abbaye de Leffe";
        uneSecondeBiere.lireEtiquette();                       //Affichage de l'objet
    }
}
