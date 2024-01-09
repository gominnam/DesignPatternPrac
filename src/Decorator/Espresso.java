package Decorator;

public class Espresso implements ICoffee {//Base Coffee
    public boolean ice = false;

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Espresso");
        if(ice) description = description.append(" with Ice");
        return description.toString();
    }

    @Override
    public double getCost() {
        double cost = 2000;
        if(ice) cost += 500;
        return cost;
    }

    @Override
    public void addIce() {
        ice = true;
    }
}
