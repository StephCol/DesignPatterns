package Decorator.Skills;

import Decorator.Characters.Character;

public class TimeTravel extends FreeSkills{
    public TimeTravel(Character c){
        character = c;
        skillDescription = "TimeTravel";
        score = 8;
    }

}
