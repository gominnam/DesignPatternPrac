package Creational_Patterns.AbstractFactory.abstFactory;

import Creational_Patterns.AbstractFactory.beans.Car;

public interface CarFactory {
    public static Car createCar(CarAbstractFactory caf){
        return caf.createCar();
    }
}
