package Game_Decorator_Singleton.Skills;

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
