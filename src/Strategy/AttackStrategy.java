package Strategy;

public class AttackStrategy implements IGameStrategy{
    @Override
    public void play() {
        System.out.println("Strategy change to attack!");
    }
}
