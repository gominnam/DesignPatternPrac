package Creational_Patterns.AbstractFactory;


import Creational_Patterns.AbstractFactory.abstFactory.BenzFactory;
import Creational_Patterns.AbstractFactory.abstFactory.CarFactory;
import Creational_Patterns.AbstractFactory.abstFactory.HyunDaeFactory;
import Creational_Patterns.AbstractFactory.beans.Car;

// client
public class make {
    public static void main(String[] args){

        Car hyundae = CarFactory.createCar(new HyunDaeFactory("comos", "gumho", "hyundae"));

        Car benz = CarFactory.createCar(new BenzFactory("benz", "Michelin", "lg"));
    }
}