package Decorator;

public class Main {
    public static void main(String[] args) {
        Character dragon = new Animal();
        dragon.setName("Drago");
        Game g1 = new Game(dragon);
        g1.getGameStats();

        Character rob = new Robot();
        rob.setName("Rob");
        Game g2 = new Game(rob);
        g2.getGameStats();

        Character me = new Human();
        me.setName("Steph");
        Game g3 = new Game(me);
        g3.getGameStats();

    }
}
