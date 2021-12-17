package StrategyPattern;

import java.util.Scanner;

public class Animal extends Character {

    DataLoader data = new DataLoader("C:\\Users\\Stephanie\\Desktop\\4th Year\\Design Patterns\\DesignPatterns2\\Patterns\\src\\StrategyPattern\\DataFiles\\Animals.csv");

    protected String animalType;

    protected Animal(){
        characterType = CharacterType.ANIMAL;
        data.loadData();
        setAnimalType();
        greeting = data.getGreeting(animalType);
    }

    private void setAnimalType(){

        Scanner sc= new Scanner(System.in);

        System.out.print("\nChoose an animal from the following list: ");
        data.getValues();

        System.out.print("Enter Animal type: ");
        animalType = sc.nextLine().toUpperCase();

        while(!data.isValidType(animalType)){
            System.out.print("INCORRECT ANIMAL TYPE - Please re-enter: ");
            animalType = sc.nextLine().toUpperCase();
        }

    }
}
