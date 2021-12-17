package Decorator_Singleton_Adapter.Skills;

import Decorator_Singleton_Adapter.Characters.Character;

public class Invisibility extends PremiumSkills {

    public Invisibility(Character c){
        character = c;
        skillDescription = "Invisibility";
        score = 9;
        subscriptionType = c.getSubscriptionType();
    }

}