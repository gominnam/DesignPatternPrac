package Structural_Patterns.Decoration.beans;

public class CasualDress extends DressDecorator {
    public CasualDress(Dress c){
        super(c); // 부모 생성자
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Casual Dress");
    }
}
