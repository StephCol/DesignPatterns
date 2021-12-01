package Decorator.Characters;

public abstract class Character{

    protected String name;
    protected String characterType;
    protected String subscriptionType;


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public String getDetails(){
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: ";
    }

    public abstract int getScore();

}
