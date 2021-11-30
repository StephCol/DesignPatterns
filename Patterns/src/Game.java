import java.util.ArrayList;

public class Game {

    private Character c1;

    public Game(Character c){
        c1 = c;
    }

    public void getGameStats(){
        System.out.println(c1.getName() + " has " + c1.getSkills() + " skill \n" + "Score is " + c1.getScore());
    }


}
