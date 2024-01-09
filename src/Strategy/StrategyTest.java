package Strategy;

public class StrategyTest {
    public static void main(String[] args){
        SoccerManager soccerManager = new SoccerManager();
        soccerManager.setStrategy(new AttackStrategy());
        soccerManager.setGameStrategy();
        soccerManager.setStrategy(new DefenseStrategy());
        soccerManager.setGameStrategy();
    }
}
