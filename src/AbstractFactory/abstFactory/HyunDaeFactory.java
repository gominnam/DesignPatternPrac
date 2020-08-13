package AbstractFactory.abstFactory;

import AbstractFactory.beans.Car;
import AbstractFactory.beans.HyunDaeCar;

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
