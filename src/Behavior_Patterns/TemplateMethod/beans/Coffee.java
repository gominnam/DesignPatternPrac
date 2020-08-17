package Behavior_Patterns.TemplateMethod.beans;

public class Coffee extends Beverage{

    @Override
    protected void addExtraComponent() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    protected void addMainComponent() {
        System.out.println("Brewing Coffee");
    }
}
