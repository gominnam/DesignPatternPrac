package Behavior_Patterns.TemplateMethod.beans;
//template method
public abstract class Beverage {

    public final void prepare() {
        boilWater();
        addMainComponent();
        addWaterToCup();
        addExtraComponent();
    }

    protected abstract void addExtraComponent();

    protected abstract void addMainComponent();

    protected void boilWater() {
        System.out.println("Boiling Water");
    }

    protected void addWaterToCup(){
        System.out.println("Adding water to cup");
    }
}

