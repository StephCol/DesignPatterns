public class Robot extends Character{

    private PsychicSkill s = new PsychicSkill();
    private InvisibilitySkill s2 = new InvisibilitySkill();
    private FlightSkill s3 = new FlightSkill();

    public Robot(String name) {
        super(name);
        setSkill();
    }

    @Override
    public void setSkill() {
        this.skill = s.getDescription() + ", " + s2.getDescription() + ", " + s3.getDescription();
    }

    public int getScore(){
        this.score = s.getScore() + s2.getScore() + s3.getScore();
        return this.score;
    }
}
