package com.circ;

public class Conducteur {
    private String nom;
    private String numeroPermis;
    private int acceleration;

    public Conducteur(String nom, String numeroPermis, int acceleration) {
        this.nom = nom;
        this.numeroPermis = numeroPermis;
        this.acceleration = acceleration;
    }

    public void conduit(Vehicule v) {
        System.out.println("je suis " + nom +
                " et je conduis un véhicule ");
        v.accelere(acceleration);
    }

    /* GETTERS */

    String getNom() {
        return this.nom;
    }

    String getNumeroPermis() {
        return this.numeroPermis;
    }

    int getAcceleration() {
        return this.acceleration;
    }

    /* SETTERS */
    void setNom(String newValue) {
        this.nom = newValue;
    }

    void setNumeroPermis(String newValue) {
        this.numeroPermis = newValue;
    }

    void setAcceleration(int ac) {
        this.acceleration = ac;
    }

}