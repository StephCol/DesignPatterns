package Game_Decorator_Singleton.Skills;

import Game_Decorator_Singleton.Characters.Character;

public class TimeTravel extends FreeSkills{
    public TimeTravel(Character c){
        character = c;
        skillDescription = "TimeTravel";
        score = 8;
        subscriptionType = c.getSubscriptionType();
    }

}
