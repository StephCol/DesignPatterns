package StrategyPattern.Problem;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Character {

    protected static CharacterType characterType;

    public abstract void eat();
    public abstract void talk();
    public abstract void walk();
}
