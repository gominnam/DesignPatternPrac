package AbstractFactory;

import AbstractFactory.HyunCar.HyunFactory;
import AbstractFactory.abst.Body;
import AbstractFactory.abst.CarFactory;
import AbstractFactory.abst.Handle;
import AbstractFactory.abst.Wheel;

public class make {
    public static void main(String[] args){
        CarFactory factory = new HyunFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        Handle handle = factory.createHandle();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
        System.out.println(handle.getClass());
    }
}
