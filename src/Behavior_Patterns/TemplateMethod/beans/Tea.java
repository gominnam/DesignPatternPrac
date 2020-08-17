package Behavior_Patterns.TemplateMethod.beans;

public class Tea extends Beverage{

    @Override
    protected void addExtraComponent() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void addMainComponent() {
        System.out.println("Adding tea");
    }
}
