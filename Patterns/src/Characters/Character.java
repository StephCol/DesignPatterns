package Characters;

import java.util.ArrayList;

public abstract class Character{

    protected String name = "Unknown";
    protected String description = "Character";

    public abstract int getScore();

    public void setName(String name){
        this.name = name;
    }

    public String getDetails(){
        return "Character Type: " + this.description
                + "\nCharacter Name: " + this.name
                + "\nSkills: ";
    }
}

