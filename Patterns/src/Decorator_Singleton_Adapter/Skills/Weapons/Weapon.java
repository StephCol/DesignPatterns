package Decorator_Singleton_Adapter.Skills.Weapons;

public abstract class Weapon {
    protected String weaponType;
    protected int points;
    protected String subscriptionType;

    public String getType(){
        return weaponType;
    }

    public int getPoints(){
        return points;
    }

    public abstract String execute();

    public String getSubscriptionType(){
        return subscriptionType;
    }
}
