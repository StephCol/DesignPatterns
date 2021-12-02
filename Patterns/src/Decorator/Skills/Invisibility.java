package Decorator.Skills;

import Decorator.Characters.Character;

public class Invisibility extends PremiumSkills {

    public Invisibility(Character c){
        character = c;
        skillDescription = "Invisibility";
        score = 9;
    }

}