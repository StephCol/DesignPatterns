package Game_Decorator_Singleton.Skills;

public abstract class Gun implements Weapon {
    protected String weaponType = " Gun";
    protected int points;

    public String getType(){
        return weaponType;
    }

    public int getPoints(){
        return points;
    }

    public abstract String execute();
}
