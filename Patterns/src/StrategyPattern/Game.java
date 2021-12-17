package StrategyPattern;


import java.util.Scanner;

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

    public void getGameStats(){
        character.getDetails();
    }

    public void run(){
        System.out.print("Welcome to the Strategy Game!\nTo get started you need to make some important decisions");
        character = Character.getCharacterInstance();
        getCommands();
    }

    private void getCommands(){
        String action = "";
        Scanner sc= new Scanner(System.in);

        while(!action.equals("EXIT")){
            System.out.print("\nEnter 'exit' to end the game\nWhat would you like to do next: Eat or Speak? ");
            action = sc.nextLine().toUpperCase();

            if(action.equals("EAT"))
                character.eat();
            else if(action.equals("SPEAK"))
                character.speak();
            else
                if(!action.equals("EXIT"))
                    System.out.println("\nINVALD ENTRY");
        }


    }




}
