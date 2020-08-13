package AbstractFactory.HyunCar;

import AbstractFactory.abst.Body;
import AbstractFactory.abst.CarFactory;
import AbstractFactory.abst.Handle;
import AbstractFactory.abst.Wheel;

public class HyunFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new HyunBody();
    }

    @Override
    public Wheel createWheel() {
        return new HyunWheel();
    }

    @Override
    public Handle createHandle() {
        return new HyunHandle();
    }
}
