package Game_Decorator_Singleton.Skills;

public class FreeSkills extends SkillsDecorator{
    @Override
    public int getScore() {
        return character.getScore() + score;
    }
    @Override
    public String getDetails() {
        return character.getDetails() + "\n" + skillDescription ;
    }
}
