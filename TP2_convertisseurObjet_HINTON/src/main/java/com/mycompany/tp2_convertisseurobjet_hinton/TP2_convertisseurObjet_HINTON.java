/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_hinton;

/**
 *
 * @author 33621
 */
public class TP2_convertisseurObjet_HINTON {

    public static void main(String[] args) {

        //Création de l'objet "ConvertisseurUniversel" de class "Convertisseur":
        Convertisseur ConvertisseurUniversel = new Convertisseur (); 
        //Conversions avec l'aide de méthodes de class "Convertisseur"
        ConvertisseurUniversel.CelciusVersKelvin(20);      
        ConvertisseurUniversel.FarenheitVersKelvin(80);       
        ConvertisseurUniversel.KelvinVersCelcius(290);  
        ConvertisseurUniversel.KelvinVersFarenheit(310);
        //Affichage du nombre de conversions effectué par l'objet "ConvertisseurUniversel":
         System.out.println(ConvertisseurUniversel);
        
        //Création de l'objet "ConvertisseurMeteo" de class "Convertisseur":
        Convertisseur ConvertisseurMeteo = new Convertisseur ();
        //Conversion avec l'aide de méthodes de class "Convertisseur"
        ConvertisseurMeteo.CelciusVersFarenheit(25);
        ConvertisseurMeteo.FarenheitVersCelcius(75);
        //Affichage du nombre de conversions effectué par l'objet "ConvertisseurMeteo":
        System.out.println(ConvertisseurMeteo);
    }
}
