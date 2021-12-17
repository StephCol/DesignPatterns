package Decorator_Singleton_Adapter.Skills;
import Decorator_Singleton_Adapter.Characters.Character;

public class Flight extends PremiumSkills {

    public Flight(Character c){
        character = c;
        skillDescription = "Flight";
        score = 12;
        subscriptionType = c.getSubscriptionType();
    }
}
