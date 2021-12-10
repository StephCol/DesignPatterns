package Game_Decorator_Singleton;

import Game_Decorator_Singleton.Characters.*;
import Game_Decorator_Singleton.Characters.Character;
import Game_Decorator_Singleton.Skills.*;


public class GameDriver {
    public static void main(String[] args) {
        Character dragon = Character.getCharacterInstance(CharacterType.ANIMAL);
        dragon.setName("Drago");
        dragon.setSubscriptionType(Subscription.PREMIUM);

        dragon = new Teleportation(new TimeTravel(new Flight(dragon)));
        dragon = new WeaponAdapter(new WeaponAdapter(dragon, new PocketKnife()), new MachineGun());

        Game g1 = Game.getGameInstance();
        g1.assignCharacter(dragon);
        g1.getGameStats();

        Character human = Character.getCharacterInstance(CharacterType.HUMAN);
        //returns existing Animal instance

        Game g2 = Game.getGameInstance();
        //returns the existing Game instance

        g2.assignCharacter(human);
        g2.getGameStats();
    }
}

