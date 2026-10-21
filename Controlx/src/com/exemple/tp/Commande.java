package com.exemple.tp;



 class Commande {
    private String numero;
    private String destination;

    public Commande(String numero, String destination) {
        this.numero = numero;
        this.destination = destination ;
    }

   
    public String toString() {
        return "Numero : " + numero
               + ", Destination : " + destination;
    }
 }