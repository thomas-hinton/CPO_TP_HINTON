/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_hinton;

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
        
        
    }
}
