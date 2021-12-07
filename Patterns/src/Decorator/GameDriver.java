package Decorator;

import Decorator.Characters.Animal;
import Decorator.Characters.Character;
import Decorator.Characters.Human;
import Decorator.Characters.Robot;
import Decorator.Skills.*;

public class GameDriver {
    public static void main(String[] args) {
        Character dragon = new Animal();
        dragon.setName("Drago");
        dragon.setSubscriptionType(Subscription.EXCLUSIVE);
        dragon = new Teleportation(dragon);
        dragon = new TimeTravel(dragon);
        dragon = new Flight(dragon);
        Game g1 = Game.getGameInstance();
        g1.assignCharacter(dragon);
        g1.getGameStats();

        Game g2 = Game.getGameInstance();
        g2.getGameStats();
    }
}
