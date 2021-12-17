package Decorator_Singleton_Adapter;

import Decorator_Singleton_Adapter.Characters.*;
import Decorator_Singleton_Adapter.Characters.Character;
import Decorator_Singleton_Adapter.Skills.*;
import Decorator_Singleton_Adapter.Skills.Weapons.MachineGun;
import Decorator_Singleton_Adapter.Skills.Weapons.PocketKnife;


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

