/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;

import Builder.*;

/**
 *
 * @author MK
 */
public class Sef {//Client

    Projektant proj; // Builder   

    Sef(Projektant proj1) {
        proj = proj1;
    }

    public static void main(String args[]) {
        Sef sef;
// ConcreteBuilder
        Projektant proj = new Projektant4(); // promenljivo!!!
        sef = new Sef(proj);
        sef.Konstruisi();
    }

    void Konstruisi() {
        proj.kreirajSoftverskiSistem();
        proj.kreirajEkranskuFormu();
        proj.kreirajBrokerBazePodataka();
        proj.kreirajKontroler();
        proj.prikaziEkranskuFormu();
    }

}
