package Decorator.Characters;
import Decorator.Subscription;

public abstract class Character{

    protected String name;
    protected CharacterType characterType;
    protected Subscription subscriptionType;
    private volatile static Character characterInstance;

    protected Character(){ }

    public static Character getCharacterInstance(CharacterType characterType){
        if(characterInstance == null) {
            synchronized (Character.class) {
                if(characterInstance == null)
                characterInstance = characterType.getCharacter();
            }
        }
        return characterInstance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSubscriptionType(Subscription subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Subscription getSubscriptionType() {
        return subscriptionType;
    }

    public String getDetails(){
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: ";
    }

    public abstract int getScore();

}
