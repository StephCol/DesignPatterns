package Decorator.Skills;

import Decorator.Characters.Character;

public class Teleportation extends SkillsDecorator{
    public Teleportation(Character c){
        character = c;
        skillDescription = "\nTeleportation";
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
