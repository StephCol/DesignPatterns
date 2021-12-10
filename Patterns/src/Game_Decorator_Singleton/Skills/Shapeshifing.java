package Game_Decorator_Singleton.Skills;

import Game_Decorator_Singleton.Characters.Character;

public class Shapeshifing extends ExclusiveSkills{

    public Shapeshifing(Character c){
        character = c;
        skillDescription = "Shapeshifing";
        score = 14;
        subscriptionType = c.getSubscriptionType();
    }
}
