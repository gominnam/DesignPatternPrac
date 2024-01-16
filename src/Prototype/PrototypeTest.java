package Prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("iPhone 12 mini");
        CellPhone clone = cellPhone.clone(); //깊은 복사
        System.out.println(cellPhone == clone);
        System.out.println(cellPhone.equals(clone));
        clone.setModel("iPhone 12 Pro Max");
        System.out.println(cellPhone.getModel());
        System.out.println(clone.getModel());
    }
}

/*
        # Prototype Pattern (프로토타입 패턴)

1. 복잡한 객체 생성 및 초기화

- 객체의 생성 또는 초기화가 복잡하고 비용이 많이 들 경우, 이를 복제하여 새로운 객체를 만드는데 사용한다.
  기존 객체의 상태를 복사하여 새로운 객체를 생성하기 때문에 초기화 로직을 수행하지 않아도 된다.

2. 새로운 객체의 독립성 유지

- 프로토타입 패턴은 복제된 객체와 원본 객체를 분리합니다. (equals, == 연산자로 확인 가능)
  이는 새로운 객체가 원본 객체와 독립적으로 존재할 수 있게 하며, 한 객체의 상태 변경이 다른 객체에 영향을 미치지 않도록 합니다.

3. 유연한 디자인 구조

- 프로토타입 패턴은 객체 생성 및 초기화 로직을 별도의 클래스로 캡슐화합니다.
  이는 클라이언트 코드에서 어떤 구체적인 클래스의 인스턴스를 사용할지 동적으로 결정할 수 있도록 해줍니다.

 */
