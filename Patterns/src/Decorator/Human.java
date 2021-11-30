package Decorator;

public class Human extends Character {

    private final Invisibility invisible = new Invisibility();
    private final Flight flight = new Flight();
    private final Shapeshifing shapeshift = new Shapeshifing();
    private final TimeTravel timeTravel = new TimeTravel();
    private final Teleportation teleportation = new Teleportation();
    private final Psychic psychic = new Psychic();
    protected String characterType = "Human";

    @Override
    public String getDetails() {
        return "Character Type: " + this.characterType
                + "\nCharacter Name: " + this.name
                + "\nSkills: " + invisible.getDescription()
                + flight.getDescription()
                + shapeshift.getDescription()
                + timeTravel.getDescription()
                + teleportation.getDescription()
                + psychic.getDescription();
    }

    @Override
    public int getScore(){
        return invisible.getScore() + flight.getScore() + shapeshift.getScore()
                + timeTravel.getScore() + teleportation.getScore() + psychic.getScore();
    }
}

