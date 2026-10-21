package com.exemple.tp;

public abstract class Livreur {
    protected String identifiant;
    protected String nom;
    protected double tarifKm;
    

    public Livreur(String identifiant, String nom, double tarifKm) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.tarifKm = tarifKm;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public abstract double calculerFrais(double distance);

    public void afficherDetails() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Nom : " + nom);
        System.out.println("Tarif par km : " + tarifKm + " DH");
    }

  
    

    
    }




