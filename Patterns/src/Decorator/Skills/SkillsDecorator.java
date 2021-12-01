package Decorator.Skills;
import Decorator.Characters.Character;

public abstract class SkillsDecorator extends Character {

    Character character;
    String skillDescription;

    public abstract int getScore();

    public abstract String getDetails();

}

