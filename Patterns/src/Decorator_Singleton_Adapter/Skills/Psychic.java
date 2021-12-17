package Decorator_Singleton_Adapter.Skills;
import Decorator_Singleton_Adapter.Characters.Character;

public class Psychic extends PremiumSkills{

    public Psychic(Character c){
        character = c;
        skillDescription = "Psychic";
        score = 10;
        subscriptionType = character.getSubscriptionType();
    }

}
