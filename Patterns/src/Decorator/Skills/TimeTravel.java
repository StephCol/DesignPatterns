package Decorator.Skills;

import Decorator.Characters.Character;

public class TimeTravel extends SkillsDecorator{
    public TimeTravel(Character c){
        character = c;
        skillDescription = "\nTimeTravel";
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
