package Decorator_Singleton_Adapter.Skills;

import Decorator_Singleton_Adapter.Characters.Character;

public class Teleportation extends ExclusiveSkills{
    public Teleportation(Character c){
        character = c;
        skillDescription = "Teleportation";
        score = 17;
        subscriptionType = c.getSubscriptionType();
    }
}
