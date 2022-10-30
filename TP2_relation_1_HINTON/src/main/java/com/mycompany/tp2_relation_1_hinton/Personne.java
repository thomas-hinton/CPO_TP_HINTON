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
public class Personne {
    String nom ;
    String prenom ;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    
    /**
     * Constructeur permettant de créer un objet de class "Personne"
     * @param unnom le nom d'une personne
     * @param unprenom le prénom de la même personne
     */
    public Personne(String unnom, String unprenom) {
        nom = unnom ;
        prenom = unprenom ;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0 ;
        
    }
    /**
     * Méthode qui permet d'ajouter une voiture à un propriétaire et d'ajouter un propriétaire à une voiture
     * @param voiture_a_ajouter La voiture que l'on souhaite ajouter à la personne
     * @return false ou true, indique si l'opération est reussi ou non
     */
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null || 3 <= nbVoitures ){       //Teste si la voiture n'est pas déja acquise ou volée (Return false si c'est le cas)
            return false ;                                                     //Teste si le propriétaire à déja trop de voitures
        }
        else {
            liste_voitures[nbVoitures] = voiture_a_ajouter ;                   //Ajout de la voiture à la personne
            nbVoitures += 1 ;                                                  //Incrémentation du nombre de voitures de la personne
            voiture_a_ajouter.Proprietaire = this ;                            //Ajout du propriétaire à la voiture
            return true ;
        } 
    }
    
    
    /**
     * Méthode permettant de renvoyer le contenue d'un objet de la class
     * @return nom et prenom de la personne 
     */
    @Override
    public String toString() {
        String chaine_a_retourner ;
        chaine_a_retourner =  nom + " " + prenom ; 
        return chaine_a_retourner ;
    }
}
