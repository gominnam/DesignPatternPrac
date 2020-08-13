package AbstractFactory.abstFactory;

import AbstractFactory.beans.BenzCar;
import AbstractFactory.beans.Car;

public class BenzFactory implements CarAbstractFactory {
    private String Body;
    private String Wheel;
    private String Handle;

    public BenzFactory(String body, String wheel, String handle){
        this.Body = body;
        this.Wheel = wheel;
        this.Handle = handle;
    }

    @Override
    public Car createCar() {
        return new BenzCar(this.Body, this.Wheel, this.Handle);
    }
}
