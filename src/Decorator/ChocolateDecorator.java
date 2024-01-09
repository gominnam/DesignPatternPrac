package Decorator;

public class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 700;
    }
}
