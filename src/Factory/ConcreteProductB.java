package Factory;

public class ConcreteProductB implements Product{
    @Override
    public void create(){
        System.out.println("Product B가 생성됐습니다.");
    }
}
