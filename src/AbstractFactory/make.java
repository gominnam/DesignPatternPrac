package AbstractFactory;


import AbstractFactory.abstFactory.BenzFactory;
import AbstractFactory.abstFactory.CarFactory;
import AbstractFactory.abstFactory.HyunDaeFactory;
import AbstractFactory.beans.Car;

public class make {
    public static void main(String[] args){

        Car hyundae = CarFactory.createCar(new HyunDaeFactory("comos", "gumho", "hyundae"));

        Car benz = CarFactory.createCar(new BenzFactory("benz", "Michelin", "lg"));
    }
}