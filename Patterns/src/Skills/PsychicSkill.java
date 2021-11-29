package Skills;

import Characters.Character;

public class PsychicSkill extends SkillsDecorator{

    public PsychicSkill(Character character){
        this.character = character;
    }

    public int getScore(){
        return 10 + character.getScore();
    }

    public String getDetails() {
        return character.getDetails() + "\n- Psychic";
    }
}
