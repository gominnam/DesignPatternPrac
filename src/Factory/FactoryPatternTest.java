package Factory;

public class FactoryPatternTest {
    public static void main(String[] args){
        ProductFactory aFactory = new ConcreteFactoryA();
        Product aProduct = aFactory.createProduct();
        aProduct.create();

        ProductFactory bFactory = new ConcreteFactoryB();
        Product bProduct = bFactory.createProduct();
        bProduct.create();
    }
}

/*
## 팩토리 패턴(Factory Pattern)

- 팩토리 패턴은 객체 생성을 캡슐화하고 클라이언트에게 객체를 제공하는 디자인 패턴이다.
- 결합도가 느슨해진다.


 */