package Game_Decorator_Singleton.Skills.Weapons;

public class MachineGun extends Gun {

    public MachineGun(){
        weaponType = "Machine" + super.getType();
        points = 15;
    }

    @Override
    public String execute() {
        return "Bang Bang Bang";
    }
}