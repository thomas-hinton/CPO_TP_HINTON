/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heritage_hinton;

/**
 *
 * @author 33621
 * Déclaration et définition de la classe "Arme"
 */

public class Arme {
    //Déclaration des attributs
    String nom ;
    int niveau_attaque ;
    
    /**
     * Constructeur d'objet de class "Arme"
     * @param unnom nom de l'arme
     * @param unniveau_attaque niveau d'ttaque de l'arme (inférieure ou égale à 100 et supérieur ou égale à 0)
     */
    public Arme(String unnom, int unniveau_attaque){
        nom = unnom;
        if (unniveau_attaque<0){
            niveau_attaque = 1 ;        
        }
        else{
            if (unniveau_attaque<=100){
            niveau_attaque = unniveau_attaque ;
            }
            else{
                niveau_attaque = 100 ;
            }
        }
    }
    
    /**
     * Méthode "toString", permet de renvoyer le contenue de l'objet de la classe
     * @return le nom et le niveau d'attaque d'une épée
     */
    @Override
    public String toString() {
        String chaine_a_retourner ;
        chaine_a_retourner = "Arme:" + "\n" + "Nom: " + nom + "\n" + "Niveau d'attaque: " + niveau_attaque ; 
        return chaine_a_retourner ;
    }
}
