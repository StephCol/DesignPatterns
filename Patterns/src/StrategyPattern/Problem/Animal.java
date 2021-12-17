package StrategyPattern.Problem;

import StrategyPattern.DataLoader;

import java.util.Scanner;

public class Animal extends Character {

    protected Animal(){
        characterType = CharacterType.ANIMAL;
    }

    @Override
    public void eat() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }
}
