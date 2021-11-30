package Decorator;

import java.util.ArrayList;

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

    public abstract String getDetails();
    public abstract int getScore();

}
