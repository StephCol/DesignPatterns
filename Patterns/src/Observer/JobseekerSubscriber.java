package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobseekerSubscriber implements AgencySubscriber {

    private List<Skills> skills;
    private Role role;
    private String notification;
    private JobseekerPublisher agency;

    public JobseekerSubscriber(JobseekerPublisher subject, Role role, List<Skills> skills){
        agency = subject;
        this.role = role;
        this.skills = skills;
        agency.registerClient(this);
    }

    @Override
    public void update(String notification) {
        this.notification = notification;
        display();
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public Role getRole() {
        return role;
    }

    private void display() {
        System.out.println("JOBSEEKER UPDATED: " + notification);
    }
}
