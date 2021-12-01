package Decorator.Skills;
import Decorator.Characters.Character;

public class Psychic extends SkillsDecorator{

    public Psychic(Character c){
        character = c;
        skillDescription = "\nPsychic";
    }

    @Override
    public int getScore() {
        return character.getScore() + 5;
    }
    @Override
    public String getDetails() {
        return character.getDetails() + skillDescription;
    }
}
