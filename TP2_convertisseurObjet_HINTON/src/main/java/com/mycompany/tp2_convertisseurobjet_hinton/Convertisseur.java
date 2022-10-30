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
    
    /**
     * Méthode permettant de convertir des Celcius en Kelvin
     * @param tempCelcius la température en Celcius
     * @return la température en Kelvin
     */
    double CelciusVersKelvin (double tempCelcius){
        nbConversions += 1;
        return tempCelcius + 237.15;
    }
    
    /**
     * Méthode permettant de convertir des Kelvin en Celcius
     * @param tempKelvin la température en Kelvin
     * @return le température en Celcius
     */
    double KelvinVersCelcius (double tempKelvin){
        nbConversions += 1;
        return tempKelvin - 273.15;
    }
    
    /**
     * Méthode permettant de convertir des Farenheit en Celcius
     * @param tempFarenheit la température en Farenheit
     * @return la température en Celcius
     */
    double FarenheitVersCelcius (double tempFarenheit){
        nbConversions += 1;
        return (tempFarenheit - 32) / (9 / 5);
    }
    
    /**
     * Méthode permettant de convertir des Celcius en Farenheit
     * @param tempCelcius la température en Celcius
     * @return la température en Farenheit
     */
    double CelciusVersFarenheit (double tempCelcius){
        nbConversions += 1;
        return (tempCelcius * (9 / 5)) + 32;
    }
    
    /**
     * Méthode permettant de convertir des Farenheit en Kelvin
     * @param tempFarenheit la température en Farenheit
     * @return la température en Kelvin
     */
    double FarenheitVersKelvin (double tempFarenheit){
        nbConversions += 1;
        return CelciusVersKelvin(FarenheitVersCelcius(tempFarenheit));
    }
    
    /**
     * Méthode permettant de convertir des Kelvin en Farenheit
     * @param tempKelvin la température en Kelvin
     * @return la température en Farenheit
     */
    double KelvinVersFarenheit (double tempKelvin){
        nbConversions += 1;
        return CelciusVersFarenheit(KelvinVersCelcius(tempKelvin));
    } 
    
    /**
     *Méthode "to "string:
     * retourne la chaine de caractère que l’on veut afficher quand l’objet est cité.
     * @return le nombre de conversions effectuées
     */
    @Override
    public String toString () {
        return "nb de conversions: "+ nbConversions;
    }
}
