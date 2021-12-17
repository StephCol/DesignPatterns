package Decorator_Singleton_Adapter.Characters;

public class Animal extends Character {

    protected Animal(){
        characterType = CharacterType.ANIMAL;
    }
    public int getScore(){
        return 0;
    }
}
