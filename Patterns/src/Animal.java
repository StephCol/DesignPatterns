public class Animal extends Character {

    private FlightSkill s = new FlightSkill();
    private PsychicSkill s2 = new PsychicSkill();
    private ShapeshifingSkill s3 = new ShapeshifingSkill();

    public Animal(String name) {
        super(name);
        setSkill();
    }

    @Override
    public void setSkill() {
        this.skill = s.getDescription() + ", " + s2.getDescription() + ", " + s3.getDescription() ;
    }

    public int getScore(){
        this.score = s.getScore() + s2.getScore() + s3.getScore();
        return this.score;
    }
}
