package com.mycompany.tp2_bieres_hinton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33621
 */
public class BouteilleBiere {
    String nom = "";
    double degreAlcool = 0;
    String brasserie = "";
    boolean ouverte = false; 
    
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
}
