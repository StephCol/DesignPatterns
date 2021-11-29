package Skills;

import Characters.Character;

public class ShapeshifingSkill extends SkillsDecorator{

    public ShapeshifingSkill(Character character){
        this.character = character;
    }

    public int getScore(){
        return 8 + character.getScore();
    }

    public String getDetails() {
        return character.getDetails() + "\n- Shapeshifing";
    }
}

