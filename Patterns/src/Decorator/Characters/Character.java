package Decorator.Characters;
import Decorator.Subscription;

public abstract class Character{

    protected String name;
    protected String characterType;
    protected Subscription subscriptionType;

    public void setName(String name){
        this.name = name;
    }

    public void setSubscriptionType(Subscription subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Subscription getSubscriptionType() {
        return subscriptionType;
    }

    public String getDetails(){
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: ";
    }

    public abstract int getScore();

}
