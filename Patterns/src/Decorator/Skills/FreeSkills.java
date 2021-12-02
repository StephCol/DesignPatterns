package Decorator.Skills;

public class FreeSkills extends SkillsDecorator{
    @Override
    public int getScore() {
        return character.getScore() + 5;
    }
    @Override
    public String getDetails() {
        return character.getDetails() + "\n " + skillDescription + "\n";
    }
}
