package Decorator;

import Decorator.Characters.*;
import Decorator.Characters.Character;
import Decorator.Skills.*;

public class GameDriver {
    public static void main(String[] args) {
        Character dragon = Character.getCharacterInstance(CharacterType.ANIMAL);
        dragon.setName("Drago");
        dragon.setSubscriptionType(Subscription.EXCLUSIVE);
        dragon = new Teleportation(dragon);
        dragon = new TimeTravel(dragon);
        dragon = new Flight(dragon);
        Game g1 = Game.getGameInstance();
        g1.assignCharacter(dragon);
        g1.getGameStats();

        Character human = Character.getCharacterInstance(CharacterType.HUMAN);
        System.out.println(human.getDetails()); //returns Animal Character first made

    }
}
