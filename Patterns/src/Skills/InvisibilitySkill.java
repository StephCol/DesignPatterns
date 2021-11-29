package Skills;

import Characters.Character;

public class InvisibilitySkill extends SkillsDecorator{

    public InvisibilitySkill(Character character){
        this.character = character;
    }

    public int getScore(){
        return 12 + character.getScore();
    }

    public String getDetails() {
        return character.getDetails() + "\n- Invisibility";
    }
}