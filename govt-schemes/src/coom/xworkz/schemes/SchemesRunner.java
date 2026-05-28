package coom.xworkz.schemes;

import coom.xworkz.schemes.imp.Schemes;
import coom.xworkz.schemes.imp.impl.Jharkhand;
import coom.xworkz.schemes.imp.impl.Karnataka;

public class SchemesRunner {
    public static void main(String[] args){
        Schemes kar = new Karnataka();
        kar.abuaAwasYojana();
        kar.atalAsraYojana();
        kar.atalBeemitVyaktiKalyanYojana();
        kar.employeesPensionScheme();
        kar.handloomRebateScheme();

        Schemes jhar = new Jharkhand();
        jhar.balAshrams();
        jhar.expansionOfCoffee();
    }
}
