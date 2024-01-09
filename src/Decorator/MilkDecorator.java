package Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1000;
    }
}
