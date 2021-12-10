package Game_Decorator_Singleton.Skills.Weapons;

public abstract class Gun extends Weapon {

    public Gun(){
        weaponType = " Gun";
        subscriptionType = "Premium";
    }

    public abstract String execute();


}
