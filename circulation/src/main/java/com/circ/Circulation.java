package com.circ;

public class Circulation {
    public static void main(String[] args) {
        // Object a = new Automobile(0, 50);
        Automobile a = new Automobile(0, 50);
        // Object v = new Velo(0, "VTT");
        Velo v = new Velo(0, "VTT");
        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567");
        v.tombe();
        // c.conduit((Automobile) v); //can't cast from velo to automobile bcz both are
        // sub classes of vehicule
        c.conduit(a);
        vh = a;
        ((Automobile) vh).faitLePlein(10);// cannot be cast to class so we should add vh = a; bzc vh automobile is a sub
                                          // class of vehicule

    }
}