package Decorator;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 400;
    }
}
