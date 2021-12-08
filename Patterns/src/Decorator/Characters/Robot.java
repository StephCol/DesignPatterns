package Decorator.Characters;

public class Robot extends Character {

    protected Robot(){
        characterType = CharacterType.ROBOT;
    }

    public int getScore(){
        return 0;
    }
}
