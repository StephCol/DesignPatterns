import Characters.Character;

public class Game {

    private Character c1;

    public Game(Character c){
        c1 = c;
    }

    public void getGameStats(){
        System.out.println(c1.getDetails() + "\nScore: " + c1.getScore());
    }


}
