package Game_Decorator_Singleton.Skills;

import Game_Decorator_Singleton.Characters.Character;

public class Teleportation extends ExclusiveSkills{
    public Teleportation(Character c){
        character = c;
        skillDescription = "Teleportation";
        score = 17;
        subscriptionType = c.getSubscriptionType();
        System.out.println(c.getSubscriptionType());
    }
}
