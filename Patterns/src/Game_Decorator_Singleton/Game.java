package Game_Decorator_Singleton;

import Game_Decorator_Singleton.Characters.Character;

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
        if(this.character == null)
            this.character = character;
    }

    public void getGameStats(){
        System.out.println(character.getDetails() + " \n" + "Score is " + character.getScore() + "\n\n");
    }


}
