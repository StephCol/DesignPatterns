package Observer.Problem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employer {
    
    private List<JobTitle> jobs = new ArrayList<>();
    private RecruitmentAgency agency;
    private String notification ;

    public Employer(RecruitmentAgency agency){
        this.agency = agency;
    }
    
    public void update() {
        notification = "EMPLOYER UPDATE: " + agency.getNotification();
    }

    public List<JobTitle> getJobs(){
        return jobs;
    }

    public void setJob(JobTitle job) {
        jobs.add(job);
    }

    public void display() {
        String timeStamp = new SimpleDateFormat("dd MMM yy HH:mm").format(new Date());
        System.out.println(timeStamp + " " + notification);
    }
}
