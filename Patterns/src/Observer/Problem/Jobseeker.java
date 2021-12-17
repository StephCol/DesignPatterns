package Observer.Problem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jobseeker {

    private final List<Skills> skills = new ArrayList<>();
    private JobTitle role;
    private RecruitmentAgency agency;
    private String notification ;

    public Jobseeker(RecruitmentAgency agency){
        this.agency = agency;
    }

    public void update() {
        notification = "JOBSEEKER UPDATE: " + agency.getNotification();
    }

    public List<Skills> getSkills(){
        return skills;
    }

    public void setSkill(Skills skill) {
        skills.add(skill);
    }

    public JobTitle getRole() {
        return role;
    }

    public void setRole(JobTitle role) {
        this.role = role;
    }


    public void display() {
        String timeStamp = new SimpleDateFormat("dd MMM yy HH:mm").format(new Date());
        System.out.println(timeStamp + " " + notification);
    }
}
