package Builder;

public class BuilderTest {
    public static void main(String[] args){
        Apartment apartment = new Apartment.Builder()
                                    .setBrandName("Samsung")
                                    .setFloor(20)
                                    .setRoom(4)
                                    .setKitchen(1)
                                    .setBathroom(2)
                                    .setBalcony(1)
                                    .build();

        System.out.println(apartment);
    }
}

/*

객체의 생성자에 많은 매개변수가 필요할 때, 빌더 패턴을 사용하면 객체를 생성하기가 편리(명확)하다.
매서드 체이을 통해 코드의 가독성이 좋아진다.

 */