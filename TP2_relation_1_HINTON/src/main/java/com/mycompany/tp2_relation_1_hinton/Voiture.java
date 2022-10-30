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
public class Voiture {
    String Modele ;
    String Marque ;
    int PuissanceCV ;
    Personne Proprietaire ;
    
    /**
     * Constructeur d'objet de class "Voiture"
     * @param unModele modèle de la voiture
     * @param uneMarque marque de la voiture
     * @param unePuissanceCV puissance de la voiture
     */
    public Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        Modele = unModele ;
        Marque = uneMarque ;
        PuissanceCV = unePuissanceCV ;
        Proprietaire = null ;  
    }
    
    /**
     * Méthode "toString", permet de renvoyer le contenue de l'objet de la classe
     * @return le modèle, la marque et la puissance d'une voiture
     */
    @Override
    public String toString() {
        String chaine_a_retourner ;
        chaine_a_retourner = "Voiture" + "\n" +  "Model: " + Modele + "\n" + "Marque:" + Marque + "\n" + "PuissanceCV: " + PuissanceCV ; 
        return chaine_a_retourner ;
    }
}
