package Creational_Patterns.Builder.Client;

import Creational_Patterns.Builder.beans.Computer;
import Creational_Patterns.Builder.beans.ComputerBuilderDirector;

public class make {
    public static void main(String[] args){

        Computer comp = new Computer.Builder("16GB", "8TB", "inter i7").build();

        Computer comp1 = new Computer.Builder("16GB", "8TB", "inter i7").setGraphicsCardEnable(true).build();

        Computer comMake = new ComputerBuilderDirector().getBasicComputer();

        System.out.println(comp);
    }
}
