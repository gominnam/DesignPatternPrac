package AbstractFactory.abstFactory;

import AbstractFactory.beans.Car;

public interface CarFactory {
    public static Car createCar(CarAbstractFactory caf){
        return caf.createCar();
    }
}
