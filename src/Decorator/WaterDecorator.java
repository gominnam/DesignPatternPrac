package Decorator;

public class WaterDecorator extends CoffeeDecorator{
    public WaterDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Water";
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}
