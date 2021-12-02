package Decorator;

import Decorator.Characters.Animal;
import Decorator.Characters.Character;
import Decorator.Characters.Human;
import Decorator.Characters.Robot;
import Decorator.Skills.*;

public class Main {
    public static void main(String[] args) {
        Character dragon = new Animal();
        dragon.setName("Drago");
        dragon.setSubscriptionType(Subscription.EXCLUSIVE);
        dragon = new TimeTravel(dragon);
        dragon = new Teleportation(dragon);
        dragon = new Flight(dragon);
        Game g1 = new Game(dragon);
        g1.getGameStats();

        Character rob = new Robot();
        rob.setName("Rob");
        rob.setSubscriptionType(Subscription.PREMIUM);
        rob = new Invisibility(rob);
        rob = new Teleportation(rob);
        Game g2 = new Game(rob);
        g2.getGameStats();

        Character me = new Human();
        me.setName("Steph");
        me.setSubscriptionType(Subscription.PREMIUM);
        me = new Psychic(me);
        me = new TimeTravel(me);
        Game g3 = new Game(me);
        g3.getGameStats();

    }
}
