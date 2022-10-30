package com.mycompany.tp2_convertisseurobjet_hinton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 33621
 */
public class Convertisseur {    //Définition de notre classe
    int nbConversions;              //Compteur du nombre de convertions faites
  
    
    /**
     *Constructeur permettat de créer un objet de classe Convertisseur
     * initialison de son attribut "nbConversions à 0"
     */
    public Convertisseur () {  
        nbConversions = 0 ;     //initialisation à 0 
    }
    double CelciusVersKelvin (double tempCelcius){
        nbConversions += 1;
        return tempCelcius + 237.15;
    }
    
    double KelvinVersCelcius (double tempKelvin){
        nbConversions += 1;
        return tempKelvin - 273.15;
    }
    
    double FarenheitVersCelcius (double tempFarenheit){
        nbConversions += 1;
        return (tempFarenheit - 32) / (9 / 5);
    }
    
    double CelciusVersFarenheit (double tempCelcius){
        nbConversions += 1;
        return (tempCelcius * (9 / 5)) + 32;
    }
    
    double FarenheitVersKelvin (double tempFarenheit){
        nbConversions += 1;
        return ((tempFarenheit - 32) / (9 / 5)) + 237.15;
    }
    
    double KelvinVersFarenheit (double tempKelvin){
        nbConversions += 1;
        return ((tempKelvin - 273.15) * (9 / 5)) + 32;
    } 
    
    /**
     *Méthode "to "string:
     * retourne la chaine de caractère que l’on veut afficher quand l’objet est cité.
     * @return le nombre de conversions effectuées
     */
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
}
