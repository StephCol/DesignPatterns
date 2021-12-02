package Decorator.Skills;
import Decorator.Characters.Character;

public class Psychic extends PremiumSkills{

    public Psychic(Character c){
        character = c;
        skillDescription = "Psychic";
        score = 10;
    }

}
