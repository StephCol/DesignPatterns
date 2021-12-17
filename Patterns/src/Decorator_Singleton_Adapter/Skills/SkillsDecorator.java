package Decorator_Singleton_Adapter.Skills;
import Decorator_Singleton_Adapter.Characters.Character;
import Decorator_Singleton_Adapter.Subscription;

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

