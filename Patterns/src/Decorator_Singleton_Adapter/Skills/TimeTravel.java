package Decorator_Singleton_Adapter.Skills;

import Decorator_Singleton_Adapter.Characters.Character;

public class TimeTravel extends FreeSkills{
    public TimeTravel(Character c){
        character = c;
        skillDescription = "TimeTravel";
        score = 8;
        subscriptionType = c.getSubscriptionType();
    }

}
