import Characters.Animal;
import Characters.Character;
import Characters.Human;
import Characters.Robot;
import Skills.FlightSkill;
import Skills.InvisibilitySkill;
import Skills.PsychicSkill;
import Skills.ShapeshifingSkill;

public class Main {
    public static void main(String[] args) {

        Character dragon = new Animal();
        dragon.setName("Dragon");
        dragon = new InvisibilitySkill(dragon);
        dragon = new ShapeshifingSkill(dragon);
        dragon = new FlightSkill(dragon);
        Game g1 = new Game(dragon);
        g1.getGameStats();

        System.out.println();

        Character rob = new Robot();
        rob.setName("Rob");
        rob = new FlightSkill(rob);
        rob = new PsychicSkill(rob);
        Game g2 = new Game(rob);
        g2.getGameStats();

        System.out.println();

        Character me = new Human();
        me.setName("Steph");
        me = new FlightSkill(me);
        me = new InvisibilitySkill(me);
        Game g3 = new Game(me);
        g3.getGameStats();

    }
}
