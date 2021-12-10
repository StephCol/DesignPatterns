package Game_Decorator_Singleton.Skills;

public abstract class Knife extends Weapon {

    public Knife(){
        weaponType = " Knife";
        subscriptionType = "Exclusive";
    }

    public abstract String execute();

}
