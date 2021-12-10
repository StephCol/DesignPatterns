package Game_Decorator_Singleton.Skills.Weapons;

public class PelletGun extends Gun {

    public PelletGun(){
        weaponType = "Pellet" + super.getType();
        points = 5;
    }

    @Override
    public String execute() {
        return "Ping";
    }
}
