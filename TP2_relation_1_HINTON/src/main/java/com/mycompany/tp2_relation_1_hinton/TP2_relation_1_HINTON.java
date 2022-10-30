/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1_hinton;

/**
 *
 * @author 33621
 */
public class TP2_relation_1_HINTON {

    public static void main(String[] args) {
        //Création d'objets de class "Voiture" : uneClio, uneAutreClio, une2008, uneMicra:
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        //Création d'objets de class "Personne" : 
        Personne Bob = new Personne("Bobby", "Sixkiller") ;
        Personne Reno = new Personne("Reno", "Raines") ;
        //Renvoie à l'utilisateur l'ensemble des voitures disponibles:
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        //relation « Bob est propriétaire d’une Clio »
        Bob.liste_voitures[0] = uneClio ;
        Bob.nbVoitures = 1 ;
        uneClio.Proprietaire = Bob ;
        //Accès à la voiture de Bob:
        System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0] ) ;

        //Ajout d'une seconde voiture à Bob:
        Bob.liste_voitures[1] = une2008 ;
        Bob.nbVoitures = 2 ;
        une2008.Proprietaire = Bob ;
        //Accès à la deuxième voiture de Bob:
        System.out.println("la deuxième voiture de Bob est " + Bob.liste_voitures[1] ) ;
        
        //Ajout de deux voitures à Reno:
        Reno.liste_voitures[0] = uneAutreClio ;
        uneAutreClio.Proprietaire = Reno ;
        Reno.liste_voitures[1] = uneMicra ;
        uneMicra.Proprietaire = Reno ;
        Reno.nbVoitures = 2 ;
        //Accès au deux voitures de Bob:
        System.out.println("la première voiture de Reno est " + Reno.liste_voitures[0] + "\n" + "la deuxième voiture de Reno est " + Reno.liste_voitures[1] ) ;
        
        
        //teste de la méthode "ajouter_voiture()":
        Voiture uneAudi = new Voiture ("A1", "Audi", 7 ) ; //Création d'une nouvelle voiture pour le teste
        Bob.ajouter_voiture(uneAudi) ;                                 //Assignation de la voiture à Bob => True donc reussi => CORRECT
        Reno.ajouter_voiture(uneAudi) ;                                //Assigantion de la même voiture à Reno =>False donc pas marché => CORRECT
        System.out.println(Bob.liste_voitures[2]);                                  //Affichage de la troisieme voiture de Bob => CORRECT
        System.out.println(uneAudi.Proprietaire);                                 //Affichage du propriétaire de la voiture => CORRECT
    }
}
