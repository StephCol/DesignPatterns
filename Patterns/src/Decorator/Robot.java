package Decorator;

public class Robot extends Character {

    private final Psychic psychic = new Psychic();
    private final Flight flight = new Flight();
    private final Invisibility invisible = new Invisibility();
    private final Shapeshifing shapeshift = new Shapeshifing();
    private final Teleportation teleport = new Teleportation();

    protected String characterType = "Robot";


    @Override
    public String getDetails() {
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: " + invisible.getDescription()
                + flight.getDescription()
                + psychic.getDescription()
                + shapeshift.getDescription()
                + teleport.getDescription();

    }

    public int getScore(){
        return psychic.getScore() + flight.getScore() + invisible.getScore()
                + shapeshift.getScore() + shapeshift.getScore();
    }
}
