package Decorator.Skills;
import Decorator.Characters.Character;

public class Flight extends PremiumSkills {

    public Flight(Character c){
        character = c;
        skillDescription = "Flight";
        score = 12;
    }
}
