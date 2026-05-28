package com.xworkz.mallApp;

import com.xworkz.mallApp.orion.Orion;
import com.xworkz.mallApp.orion.impl.*;

public class MallRunner {
    public static void main(String [] args){
        Orion adidas = new Adidas();
        adidas.doBusiness();

        Orion allen = new AllenSolly();
        allen.doBusiness();

        Orion eagle = new AmericanEagle();
        eagle.doBusiness();

        Orion and = new And();
        and.doBusiness();

        Orion bath = new BathAndBody();
        bath.doBusiness();

        Orion calvin = new CalvinKlein();
        calvin.doBusiness();

        Orion dyson = new Dyson();
        dyson.doBusiness();

        Orion ethos = new Ethos();
        ethos.doBusiness();

        Orion pvr = new Pvr();
        pvr.doBusiness();

    }
}
