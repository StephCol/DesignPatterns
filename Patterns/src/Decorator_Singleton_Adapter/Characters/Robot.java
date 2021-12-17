package Decorator_Singleton_Adapter.Characters;

public class Robot extends Character {

    protected Robot(){
        characterType = CharacterType.ROBOT;
    }

    public int getScore(){
        return 0;
    }
}
