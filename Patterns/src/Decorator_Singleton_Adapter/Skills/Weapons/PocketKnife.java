package Decorator_Singleton_Adapter.Skills.Weapons;

public class PocketKnife extends Knife {

    public PocketKnife(){
        weaponType = "Pocket" + super.getType();
        points = 10;
    }

    @Override
    public String execute() {
        return "Slash";
    }
}
