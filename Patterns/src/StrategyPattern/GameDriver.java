package StrategyPattern;

public class GameDriver {
    public static void main(String[] args) {
        Game g = Game.getGameInstance();
        g.run();

    }
}

