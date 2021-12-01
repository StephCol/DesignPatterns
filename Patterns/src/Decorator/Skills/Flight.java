package Decorator.Skills;
import Decorator.Characters.Character;

public class Flight extends SkillsDecorator {

    public Flight(Character c){
        character = c;
        skillDescription = "\nFlight";
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
