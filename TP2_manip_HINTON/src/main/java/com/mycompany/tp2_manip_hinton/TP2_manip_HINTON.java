/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_hinton;

import java.util.Arrays;

/**
 *
 * @author 33621
 */
public class TP2_manip_HINTON {

    public static void main(String[] args) {
        //Création de 2 objet de class Tartiflette:
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        //Création d'une deuxieme référence à l'objet de référence Tartiflette2:
        Tartiflette assiette3 = assiette2 ;
        
        //Affichage du nombre de callories de chaque assietes:
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;  //On se rend compte que il existe réèlement que deux assietes. Assietes 2 et 3 renvoient vers la même assiete
        
        //intervertissement des objets de assiette1 et assiette2:
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        //Teste des lignes suivantes :
        //Moussaka assiette666 = assiette1 ;     (L'objet de classe Tartiflette ne peut pas être converti en un objet de class Moussaka)
        //Moussaka assiette667 = new Tartiflette() ; (Le constructeur de class Tartiflette ne peut être utilisé pour créer des objets de class Moussaka)
        
        //Création d'un tableau de 10 références de 10 objets de class Moussaka différents:
        Moussaka TableauMoussakas [] = new Moussaka[10];        //Déclaration du tableau de type Moussaka et de taille 10
        for (int i=0 ; i<10 ; i++){                             //Parcour de l'ensemmble du tableau et affectation d'un nouvelle objet de type Moussaka à chaque du tableau
            TableauMoussakas[i] = new Moussaka(100 +(100*i));   //Les calories choisies vont de 100 à 1000 et son référencés à chaque case du tableau
        }  
    }
}
