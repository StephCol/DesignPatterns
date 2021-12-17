package StrategyPattern;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Character {

    protected static String name;
    protected static CharacterType characterType;
    private volatile static Character characterInstance;
    protected String greeting;

    protected Character(){ }

    public static Character getCharacterInstance(){
        if(characterInstance == null) {
            synchronized (Character.class) {
                if(characterInstance == null)
                    setCharacterType();

                characterInstance = characterType.getCharacter();
            }
        }
        return characterInstance;
    }

    private static void setName(String myName){
        name = myName;
    }

    public void getDetails(){
        System.out.println("Character Type: " + characterType
                + "\nCharacter Name: " + name
                + "\nSkills: ");
    }

    public void speak(){
        System.out.print("\nSPEAKING: " + greeting + " my name is " + name + "\n");
    }

    public void eat(){
        System.out.println("\nEATING: Mmmmmm delish!");
    }

    private static void setCharacterType(){
        System.out.print("\n\nChoose one of the following Character Types: " + Arrays.toString(CharacterType.getCharacterTypes()));
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Character type: ");
        String characterTypeString = sc.nextLine().toUpperCase();
        characterType = Enum.valueOf(CharacterType.class,characterTypeString);

        System.out.print("Enter Character name: ");
        String characterName = sc.nextLine();
        setName(characterName);

    }

    public CharacterType getCharacterType() {
        return characterType;
    }
}
