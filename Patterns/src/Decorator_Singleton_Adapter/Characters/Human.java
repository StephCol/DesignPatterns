package Decorator_Singleton_Adapter.Characters;

public class Human extends Character {

    protected Human(){
        characterType = CharacterType.HUMAN;
    }

    @Override
    public int getScore(){
        return 0;
    }
}

