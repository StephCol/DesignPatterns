package Characters;

import java.util.ArrayList;

public abstract class Character{

    protected String name = "Unknown";
    protected String description = "Unknown Characters.Character";

    public abstract int getScore();

    public void setName(String name){
        this.name = name;
    }

    public String getDetails(){
        return "Characters.Character Type: " + this.description
                + "\nCharacters.Character Name: " + this.name
                + "\nSkills: ";
    }
}

