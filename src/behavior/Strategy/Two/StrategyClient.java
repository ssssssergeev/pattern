package behavior.Strategy.Two;

public class StrategyClient {
    Sorting strategy;
    public void setStrategy (Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
