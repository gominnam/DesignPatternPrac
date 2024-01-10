package Decorator;

public class CoffeeDecorator implements ICoffee{
    private final ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public void addIce() {
        decoratedCoffee.addIce();
    }
}
