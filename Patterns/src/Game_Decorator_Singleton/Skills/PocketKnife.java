package Game_Decorator_Singleton.Skills;

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
