package Strategy;

public class SoccerManager {
    private IGameStrategy strategy;

    public void setStrategy(IGameStrategy strategy) {
        this.strategy = strategy;
    }

    public void setGameStrategy() {
        strategy.play();
    }
}
