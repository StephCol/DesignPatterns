package Decorator;

import Decorator.Characters.Character;

public class Game {

    private Character character;
    private volatile static Game gameInstance = new Game();

    private Game(){ }

    public static Game getGameInstance() {
        if(gameInstance == null){
            synchronized (Game.class){
                if (gameInstance == null)
                    gameInstance = new Game();
            }
        }
        return gameInstance;
    }

    public void assignCharacter(Character character){
        this.character = character;
    }

    public void getGameStats(){
        System.out.println(character.getDetails() + " \n" + "Score is " + character.getScore() + "\n\n");
    }


}
