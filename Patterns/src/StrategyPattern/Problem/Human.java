package StrategyPattern.Problem;

import StrategyPattern.DataLoader;

import java.util.Scanner;

public class Human extends Character {

    DataLoader data = new DataLoader("languages.csv");
    protected String languageType;

    protected Human(){
        characterType = CharacterType.HUMAN;
        data.loadData();
        setLanguage();
    }

    private void setLanguage(){

        Scanner sc= new Scanner(System.in);

        System.out.print("\nChoose a language from the following list: ");
        data.getValues();

        System.out.print("Enter language: ");
        languageType = sc.nextLine().toUpperCase();

        while(!data.isValidType(languageType)){
            System.out.print("INCORRECT LANGUAGE TYPE - Please re-enter: ");
            languageType = sc.nextLine().toUpperCase();
        }
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

