package Decorator;

import Decorator.Characters.Character;

public class Game {

    private Character c1;

    public Game(Character c){
        c1 = c;
    }

    public void getGameStats(){
        System.out.println(c1.getName() + " has " + c1.getDetails() + " \n" + "Score is " + c1.getScore() + "\n\n");
    }


}
