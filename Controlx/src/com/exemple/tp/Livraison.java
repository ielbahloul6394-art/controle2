package com.exemple.tp;


public class Livraison {
    private Livreur livreur;
    private Commande commande;
    private double distance;

    public Livraison(Livreur livreur, Commande commande,
                     double distance) {
        this.livreur = livreur;
        this.commande = commande;
        this.distance = distance;
    }

    public double calculerMontant() {
        return livreur.calculerFrais(distance);
    }
    
    public void afficherRecapitulatif() {
    	System.out.println( " LES LIVREURS ")
  
    }
        livreur.afficherDetails();
        System.out.println("Commande : " + commande);
        System.out.println("Distance : " + distance + " km");
        System.out.println("Montant : " + calculerMontant() + " DH");
      >}
}
