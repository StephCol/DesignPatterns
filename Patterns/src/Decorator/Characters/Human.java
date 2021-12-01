package Decorator.Characters;

public class Human extends Character {

    public Human(){
        characterType = "Human";
    }

    @Override
    public int getScore(){
        return 0;
    }
}

