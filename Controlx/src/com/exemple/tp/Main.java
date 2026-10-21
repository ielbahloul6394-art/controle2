package com.exemple.tp;


public class Main {
    public static void main(String[] args) {

      
        LivreurMoto m1 = new LivreurMoto("M1", "Ahmed", 10, 4);
        LivreurMoto m2 = new LivreurMoto("M2", "Youssef", 8, 2);

        LivreurCamion c1 = new LivreurCamion("C1", "Ali", 15, 0.20);
        LivreurCamion c2 = new LivreurCamion("C2", "Omar", 12, 0.10);

     
        Livreur[] livreurs = {m1, m2, c1, c2};

     
        Commande cmd1 = new Commande("CMD01", "Marrakech");
        Commande cmd2 = new Commande("CMD02", "Casablanca");

      
       

        @Override
        System.out.println(" LES LIVREURS");

        for (int i = 0; i < livreurs.length; i++) {
            livreurs[i].afficherDetails();

         

       
        Livraison[] livraisons = {
            new Livraison(m1, cmd1, 30),
            new Livraison(m2, cmd2, 20),
            new Livraison(c1, cmd1, 40),
            new Livraison(c2, cmd2, 50)

}
