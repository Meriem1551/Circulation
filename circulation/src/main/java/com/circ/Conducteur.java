package com.circ;

public class Conducteur {
    private String nom;
    private String numeroPermis;
    private int acceleration;

    public Conducteur(String nom, String numeroPermis) {
        this.nom = nom;
        this.numeroPermis = numeroPermis; // this shouldnt work so we need to create getters and setters
    }

    public void conduit(Vehicule v) {
        System.out.println("je suis " + nom +
                " et je conduis un véhicule ");
        v.accelere(acceleration);
    }

    public String getNumeroPermis() {
        return this.numeroPermis;
    }

    public void setNumeroPermis(String n) {
        this.numeroPermis = n;
    }

}