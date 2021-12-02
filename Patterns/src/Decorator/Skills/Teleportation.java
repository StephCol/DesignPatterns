package Decorator.Skills;

import Decorator.Characters.Character;

public class Teleportation extends ExclusiveSkills{
    public Teleportation(Character c){
        character = c;
        skillDescription = "Teleportation";
        score = 17;
    }
}
