package Game_Decorator_Singleton.Skills;
import Game_Decorator_Singleton.Characters.Character;
import Game_Decorator_Singleton.Subscription;

public abstract class SkillsDecorator extends Character {

    Character character;
    String skillDescription;
    int score;

    public abstract int getScore();

    public abstract String getDetails();

    protected Boolean isPremium() {
        return character.getSubscriptionType() == Subscription.PREMIUM;
    }

    protected Boolean isExclusive() {
        return character.getSubscriptionType() == Subscription.EXCLUSIVE;
    }

}

