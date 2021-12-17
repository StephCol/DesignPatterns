package Decorator_Singleton_Adapter.Skills.Weapons;

public class HandGun extends Gun {

    public HandGun(){
        weaponType = "Hand" + super.getType();
        points = 10;
    }

    @Override
    public String execute() {
        return "Bang";
    }
}
