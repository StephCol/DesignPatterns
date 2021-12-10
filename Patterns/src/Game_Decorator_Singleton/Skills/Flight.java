package Game_Decorator_Singleton.Skills;
import Game_Decorator_Singleton.Characters.Character;

public class Flight extends PremiumSkills {

    public Flight(Character c){
        character = c;
        skillDescription = "Flight";
        score = 12;
        subscriptionType = c.getSubscriptionType();
    }
}
