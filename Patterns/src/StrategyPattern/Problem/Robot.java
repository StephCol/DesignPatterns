package StrategyPattern.Problem;

public class Robot extends Character {

    protected Robot(){
        characterType = CharacterType.ROBOT;
    }

    @Override //Refused Bequest
    public void talk(){
        System.out.print("\nSCREEN DISPLAY: Blah Blah");
    }

    @Override //Refused Bequest
    public void eat(){
        System.out.println("\nSCREEN DISPLAY: Battery low, please charge");
    }

    @Override
    public void walk() {

    }
}
