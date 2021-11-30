import java.util.ArrayList;

public abstract class Character{

    protected String name;
    protected String skill;
    protected int score;

    protected abstract void setSkill();

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getSkills() {
        return skill;
    }

    public abstract int getScore();

}
