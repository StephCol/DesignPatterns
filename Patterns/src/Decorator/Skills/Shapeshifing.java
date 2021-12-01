package Decorator.Skills;

import Decorator.Characters.Character;

public class Shapeshifing extends SkillsDecorator{

    public Shapeshifing(Character c){
        character = c;
        skillDescription = "\nShapeshifing";
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
