/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hinton;

/**
 *
 * @author 33621
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    
    public Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Voiture" + "\n" +  "Model: " + Modele + "\n" + "Marque:" + Marque + "\n" + "PuissanceCV: " + PuissanceCV; 
        return chaine_a_retourner ;
    }
}
