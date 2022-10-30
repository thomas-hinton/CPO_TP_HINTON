/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hinton;

/**
 *
 * @author 33621
 */
public class Personne {
    String nom;
    String prenom;
    
    public Personne(String unnom, String unprenom) {
        nom = unnom ;
        prenom = unprenom ;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner =  nom + " " + prenom ; 
        return chaine_a_retourner ;
    }
}
