package Decorator.Skills;

import Decorator.Characters.Character;

public class Shapeshifing extends ExclusiveSkills{

    public Shapeshifing(Character c){
        character = c;
        skillDescription = "Shapeshifing";
        score = 14;
    }
}
