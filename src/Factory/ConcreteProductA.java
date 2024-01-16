package Factory;

public class ConcreteProductA implements Product{
    @Override
    public void create() {
        System.out.println("Product A가 생상됐습니다.");
    }
}
