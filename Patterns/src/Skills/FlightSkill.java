package Skills;

import Characters.Character;

public class FlightSkill extends SkillsDecorator{

    public FlightSkill(Character character){
        this.character = character;
    }

    public int getScore(){
        return 15 + character.getScore();
    }

    public String getDetails() {
        return character.getDetails() + "\n- Flight";
    }
}
