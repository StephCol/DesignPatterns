package Game_Decorator_Singleton.Skills.Weapons;

public abstract class Knife extends Weapon {

    public Knife(){
        weaponType = " Knife";
        subscriptionType = "Exclusive";
    }

    public abstract String execute();

}
