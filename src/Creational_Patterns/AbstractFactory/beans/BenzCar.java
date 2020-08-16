package Creational_Patterns.AbstractFactory.beans;

public class BenzCar implements Car {
    private String Body;
    private String Wheel;
    private String Handle;

    public BenzCar(String body, String wheel, String handle){
        this.Body = body;
        this.Wheel = wheel;
        this.Handle = handle;
    }

    @Override
    public String getHandle() {
        return this.Handle;
    }

    @Override
    public String getWheel() {
        return this.Wheel;
    }

    @Override
    public String getBody() {
        return this.Body;
    }
}
