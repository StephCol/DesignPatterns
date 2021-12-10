package Game_Decorator_Singleton.Skills;

public class PremiumSkills extends SkillsDecorator{
    @Override
    public int getScore() {
        if(isPremium() || isExclusive()){
            return character.getScore() + score;
        }
        else
            return character.getScore();
    }

    @Override
    public String getDetails()  {
        if(isPremium() || isExclusive()){
            return character.getDetails() + "\n" + skillDescription;
        }
        else
            return character.getDetails() + "\nERROR - Upgrade to PREMIUM to access " + skillDescription;
    }
}
