package Game_Decorator_Singleton.Skills;

public abstract class Knife implements Weapon {
    protected String weaponType = " Knife";
    protected int points;

    public String getType(){
        return weaponType;
    }

    public int getPoints(){
        return points;
    }

    public abstract String execute();
}
