package Decorator_Singleton_Adapter.Skills;

import Decorator_Singleton_Adapter.Characters.Character;

public class Shapeshifing extends ExclusiveSkills{

    public Shapeshifing(Character c){
        character = c;
        skillDescription = "Shapeshifing";
        score = 14;
        subscriptionType = c.getSubscriptionType();
    }
}
