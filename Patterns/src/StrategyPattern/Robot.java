package StrategyPattern;

public class Robot extends Character {

    protected Robot(){
        characterType = CharacterType.ROBOT;
    }


    @Override
    public void speak(){
        System.out.print("\nSCREEN DISPLAY: My name is " + name + "\n");
    }

    public void eat(){
        System.out.println("\nSCREEN DISPLAY: Battery low, please charge");
    }
}
