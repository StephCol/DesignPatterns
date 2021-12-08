package Game_Decorator_Singleton.Skills;
import Game_Decorator_Singleton.Characters.Character;

public class Psychic extends PremiumSkills{

    public Psychic(Character c){
        character = c;
        skillDescription = "Psychic";
        score = 10;
    }

}
