package Observer;

import java.util.ArrayList;
import java.util.List;

public class EmployerSubscriber implements AgencySubscriber {

    private List<Role> jobs = new ArrayList<>();
    private String notification;

    public EmployerSubscriber(EmployerPublisher agency){
        agency.registerClient(this);
    }

    @Override
    public void update(String notification) {
        this.notification = notification;
        display();
    }

    public List<Role> getJobs() {
        return jobs;
    }

    public void setJobs(List<Role> jobs) {
        this.jobs = jobs;
        JobseekerPublisher.notifyClients(this);
    }

    public void setJob(Role job){
        this.jobs.add(job);
        JobseekerPublisher.notifyClients(this);
    }

    private void display() {
        System.out.println("EMPLOYER UPDATED: " + notification);
    }
}



