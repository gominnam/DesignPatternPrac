package Structural_Patterns.Decoration.client;

import Structural_Patterns.Decoration.beans.*;

public class Wear {

    public static void main(String[] args){

        Dress basicDress = new BasicDress();
        basicDress.assemble();
        System.out.println();

        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();

        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();

        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();

        Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble();
    }
}
