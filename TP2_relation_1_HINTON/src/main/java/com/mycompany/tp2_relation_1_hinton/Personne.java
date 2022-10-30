/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_hinton;

/**
 *
 * @author 33621
 */
//Déclaration de la classe et de ses attributs:
public class Personne {
    String nom ;
    String prenom ;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    
    /**
     * Constructeur permettant de créer un objet de class "Personne"
     * @param unnom le nom d'une personne
     * @param unprenom le prénom de la même personne
     */
    public Personne(String unnom, String unprenom) {
        nom = unnom ;
        prenom = unprenom ;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0 ;
        
    }
    
    /**
     * Méthode permettant de renvoyer le contenue d'un objet de la class
     * @return nom et prenom de la personne 
     */
    @Override
    public String toString() {
        String chaine_a_retourner ;
        chaine_a_retourner =  nom + " " + prenom ; 
        return chaine_a_retourner ;
    }
}
