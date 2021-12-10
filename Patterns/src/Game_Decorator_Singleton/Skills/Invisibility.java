package Game_Decorator_Singleton.Skills;

import Game_Decorator_Singleton.Characters.Character;

public class Invisibility extends PremiumSkills {

    public Invisibility(Character c){
        character = c;
        skillDescription = "Invisibility";
        score = 9;
        subscriptionType = c.getSubscriptionType();
    }

}