package com.circ;

public class Circulation {
    public static void main(String[] args) {
        // Object a = new Automobile(0, 50);
        Automobile b = new Automobile(0, 50);// duplicated variable a so we change it to b
        // Object v = new Velo(0, "VTT");
        Velo ve = new Velo(0, "VTT");// duplicated variable v so we change it to ve
        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567", 12);// we should add a value for acceleration attribut
        ve.tombe();// tombe method is undefined for Object class so we need to change v with ve
        c.conduit(b);// can't cast to Automobile from Velo
        c.conduit(ve);// we can't acces a method unsing object from the Object class, we change a with
                      // b
        vh = b;// can't convert from Object to Vehicule, but we can assign an object that is a
               // of
               // sub class of Vehicule
        ((Automobile) vh).faitLePlein(10);
    }
}