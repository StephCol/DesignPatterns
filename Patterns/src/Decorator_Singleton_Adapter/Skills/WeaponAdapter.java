package Decorator_Singleton_Adapter.Skills;
import Decorator_Singleton_Adapter.Characters.Character;
import Decorator_Singleton_Adapter.Skills.Weapons.Weapon;
import Decorator_Singleton_Adapter.Subscription;

public class WeaponAdapter extends SkillsDecorator {
    Weapon weapon;

    public WeaponAdapter(Character c, Weapon w){
        character = c;
        weapon = w;
        skillDescription = weapon.execute()  + ": " + weapon.getType() + " activated" ;
        score = weapon.getPoints();
        subscriptionType = c.getSubscriptionType();
    }

    @Override
    public int getScore() {
        if(isPremium() && isWeaponPremium() || isExclusive() && (isWeaponPremium() || isWeaponExclusive()))
            return character.getScore() + score;
        else
            return character.getScore();
    }


    @Override
    public String getDetails() {
        if(isPremium() && isWeaponPremium() || isExclusive() && isWeaponExclusive())
             return character.getDetails() + "\n" + skillDescription;
        else
             return character.getDetails() + "\nERROR - Upgrade to " +
                     weapon.getSubscriptionType().toUpperCase() + " to access " + weapon.getType() ;
    }


    private Boolean isWeaponPremium(){
            return Enum.valueOf(Subscription.class,weapon.getSubscriptionType().toUpperCase()) == Subscription.PREMIUM;
    }


    private Boolean isWeaponExclusive(){
        return (Enum.valueOf(Subscription.class, weapon.getSubscriptionType().toUpperCase()) == Subscription.EXCLUSIVE)
                || isWeaponPremium();
    }
}



