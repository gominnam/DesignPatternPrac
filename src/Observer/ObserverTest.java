package Observer;

public class ObserverTest {
    public static void main(String[] args){
        KoNewspaper koNewspaper = new KoNewspaper();
        ConcreteSubscriber concreteSubscriber1 = new ConcreteSubscriber("KO");
        ConcreteSubscriber concreteSubscriber2 = new ConcreteSubscriber("MIN");
        ConcreteSubscriber concreteSubscriber3 = new ConcreteSubscriber("JUN");
        koNewspaper.attach(concreteSubscriber1);
        koNewspaper.attach(concreteSubscriber2);
        koNewspaper.attach(concreteSubscriber3);

        koNewspaper.setMessage("first message");

        koNewspaper.detach(concreteSubscriber2);
        koNewspaper.setMessage("second message");
    }
}
