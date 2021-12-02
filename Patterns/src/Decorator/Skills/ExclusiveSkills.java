package Decorator.Skills;

public class ExclusiveSkills extends SkillsDecorator{
    @Override
    public int getScore() {
        if(isExclusive()){
            return character.getScore() + score;
        }
        else
            return character.getScore();
    }

    @Override
    public String getDetails()  {
        if(isExclusive()){
            return character.getDetails() + "\n" + skillDescription;
        }
        else
            return character.getDetails() + "\nERROR - Upgrade to EXCLUSIVE to access " + skillDescription;
    }
}
