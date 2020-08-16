package Creational_Patterns.AbstractFactory.abstFactory;

import Creational_Patterns.AbstractFactory.beans.Car;
import Creational_Patterns.AbstractFactory.beans.HyunDaeCar;

public class HyunDaeFactory implements CarAbstractFactory {
    private String Body;
    private String Wheel;
    private String Handle;

    public HyunDaeFactory(String body, String wheel, String handle){
        this.Body = body;
        this.Wheel = wheel;
        this.Handle = handle;
    }

    @Override
    public  Car createCar() {
        return new HyunDaeCar(this.Body, this.Wheel, this.Handle);
    }
}
