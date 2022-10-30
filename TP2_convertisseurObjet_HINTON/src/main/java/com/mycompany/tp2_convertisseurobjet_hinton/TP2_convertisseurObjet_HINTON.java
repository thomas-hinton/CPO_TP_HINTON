/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_convertisseurobjet_hinton;

import java.util.Scanner; //Importation de la class "Scanner" qui nous permet de récupérer une valeur de l'utilisateur

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
        
        
        //Création de l'objet "MenuConversions" (une menu permettant de proposer à l'utilisateur de choisir une conversion):
        Convertisseur MenuConversions = new Convertisseur();
        //Création de l'objet "sc" (contiendra la valeur renvoyée par l'utilisateur)
        Scanner sc; 
        sc = new Scanner(System.in);
        //Déclaration et initialisation de la Valeur de sortie
        double ValeurSortie = 0;
        
        //Demande à l'utilisateur sa température à convertir et l'ajoute à une variable "ValeurEntree":
        System.out.println("Veuillez renseigner la température à convertir:");
        double ValeurEntree = sc.nextDouble();
        
        //Demande à l'utilisateur la onversion qu'il souhaite réaliser et l'ajoute à la variable "ConvChoisie":
        System.out.println("""
                           Veillez renseigner la conversion souhait\u00e9e(n\u00b0):
                           1)Celcius en Kelvin
                           2)Kelvin en Celcius
                           3)Farenheit en Celcius
                           4)Celcius en Farenheit
                           5)Farenheit vers Kelvin
                           6)Kelvin vers Farenheit""");
        double ConvChoisie = sc.nextInt();
        
        //converti avec la méthode choisie par l'utilisateur:
        if (ConvChoisie == 1){
            ValeurSortie = MenuConversions.CelciusVersKelvin(ValeurEntree);  
        }
        if (ConvChoisie == 2){
            ValeurSortie = MenuConversions.KelvinVersCelcius(ValeurEntree);
        }
        if (ConvChoisie == 3){
            ValeurSortie = MenuConversions.FarenheitVersCelcius(ValeurEntree);
        }
        if (ConvChoisie == 4){
            ValeurSortie = MenuConversions.CelciusVersFarenheit(ValeurEntree);
        }
        if (ConvChoisie == 5){
            ValeurSortie = MenuConversions.FarenheitVersKelvin(ValeurEntree);
        }
        if (ConvChoisie == 6){
            ValeurSortie = MenuConversions.KelvinVersFarenheit(ValeurEntree);
        }
        
        //Vérifie si il y une erreur dans la saisie de la méthode choisie / renvoie le résultat de la conversion à l'utilisateur:
        if (ConvChoisie != 1 || ConvChoisie !=2 || ConvChoisie !=3 || ConvChoisie != 4 || ConvChoisie !=5 || ConvChoisie != 6){
            System.out.println("Erreur dans la saisi de la méthode choisie");
        }
        else{
            System.out.println("Résultat de la conversion: "+ ValeurSortie);
        }      
    }
}
