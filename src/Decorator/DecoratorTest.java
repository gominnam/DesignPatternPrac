package Decorator;

public class DecoratorTest {
    public static void main(String[] args){
        ICoffee espresso = new Espresso();
        System.out.println("Espresso: " + espresso.getDescription() + " = cost : " + espresso.getCost());

        ICoffee icedAmericano = new WaterDecorator(new Espresso());
        icedAmericano.addIce();
        System.out.println("Ice-Americano: " + icedAmericano.getDescription() + " = cost : " + icedAmericano.getCost());

        ICoffee cafeLatte = new MilkDecorator(espresso);
        System.out.println("Cafe-Latte: " + cafeLatte.getDescription() + " = cost : " + cafeLatte.getCost());

        ICoffee cafeMocha = new ChocolateDecorator(cafeLatte);
        System.out.println("Cafe-Mocha: " + cafeMocha.getDescription() + " = cost : " + cafeMocha.getCost());

        ICoffee cafeMochaWithWhipCream = new WhippedCreamDecorator(cafeMocha);
        System.out.println("Whipped-Cream-Cafe-Mocha: " + cafeMochaWithWhipCream.getDescription() + " = cost : " + cafeMochaWithWhipCream.getCost());
    }
}
