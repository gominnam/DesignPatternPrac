package AbstractFactory.abst;

public interface CarFactory {

    public Body createBody();
    public Wheel createWheel();
    public Handle createHandle();

}
