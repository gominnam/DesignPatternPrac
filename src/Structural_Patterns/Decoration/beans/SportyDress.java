package Structural_Patterns.Decoration.beans;

public class SportyDress extends DressDecorator{
    public SportyDress(Dress c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sporty Dress");
    }
}
