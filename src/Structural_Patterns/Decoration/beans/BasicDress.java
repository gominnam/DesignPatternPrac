package Structural_Patterns.Decoration.beans;

public class BasicDress implements Dress{
    @Override
    public void assemble() {
        System.out.println("Basic Dress");
    }
}
