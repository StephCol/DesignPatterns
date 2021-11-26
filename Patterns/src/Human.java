public class Human extends Character{

    private InvisibilitySkill s = new InvisibilitySkill();

    public Human(String name) {
        super(name);
        setSkill();
    }

    @Override
    protected void setSkill() {
        this.skill = s.getDescription();
    }

    @Override
    public int getScore(){
        this.score = s.getScore();
        return this.score;
    }
}

