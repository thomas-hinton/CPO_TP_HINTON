package com.mycompany.tp2_bieres_hinton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33621
 */
public class BouteilleBiere {       //Définition de notre classe
    String nom = "";                        
    double degreAlcool = 0;
    String brasserie = "";
    boolean ouverte = false; 
    
    /**
     *Methode permettant renvoyant valeurs attributs de la class BouteilleBiere
     */
    public void lireEtiquette() {       
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    /**
     *Methode qui permet de ouvrir la bouteille de biere
     * @return état de la bouteille de biere si déja ouverte
     */
    public boolean Décapsuler(){
        if (ouverte == false){
            ouverte = true;
            return true;
        }
        else{
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }

    /**
     *Méthode "to "string:
     * retourne la chaine de caractère que l’on veut afficher quand l’objet est cité.
     * @return le nom, le degrès d'alcool et si la bouteille est ouverte
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
}



    /**
     *Constructeur permettat de créer un objet de classe BouteilleBiere
     * @param unNom Nom de la bierre
     * @param unDegre Degré de la biere
     * @param uneBrasserie Nom de la brasserie
     */
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
}
}
