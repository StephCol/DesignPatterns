package Decorator.Skills;

import Decorator.Characters.Character;

public class Invisibility extends SkillsDecorator {

    public Invisibility(Character c){
        character = c;
        skillDescription = "\nInvisibility";
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