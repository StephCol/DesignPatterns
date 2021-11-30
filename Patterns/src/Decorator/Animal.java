package Decorator;

public class Animal extends Character {

    private Flight flight = new Flight();
    private Psychic psychic = new Psychic();
    private Shapeshifing shapeshift = new Shapeshifing();
    private TimeTravel timeTravel = new TimeTravel();
    private Teleportation teleport = new Teleportation();
    protected String characterType = "Animal";


    @Override
    public String getDetails() {
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: " + shapeshift.getDescription()
                + flight.getDescription()
                + psychic.getDescription()
                + timeTravel.getDescription()
                + teleport.getDescription();
    }

    public int getScore(){
        return psychic.getScore() + flight.getScore() + shapeshift.getScore()
                + timeTravel.getScore() + teleport.getScore();
    }
}
