package Observer.Problem;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentAgency {

        private static List<Employer> employers = new ArrayList<>();
        private static List<Jobseeker> jobseekers =new ArrayList<>();
        private static Employer emp;
        private Jobseeker js;
        private String notification;

        public void createEmployer(){
            emp = new Employer(this);
            employers.add(emp);
        }

        public void createJobseeker(){
            js = new Jobseeker(this);
            jobseekers.add(js);
        }

        public void registerEmployer(Employer client) {
            employers.add(client);
        }

        public void registerJobseeker(Jobseeker client) {
            jobseekers.add(client);
        }

        private void notifyClients(){
            for(Employer employer : employers)
                employer.update();
            for(Jobseeker jobseeker : jobseekers)
                jobseeker.update();

            getNotificationLog();
        }

        public void setNotification(String notification){
            this.notification = notification;
            notifyClients();
        }

    public String getNotification() {
            return notification;
    }

    private void getNotificationLog(){
        for(Employer employer : employers)
            employer.display();
        for(Jobseeker jobseeker : jobseekers)
            jobseeker.display();
    }
}
