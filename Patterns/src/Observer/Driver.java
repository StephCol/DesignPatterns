package Observer;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        RecruitmentAgency agency = new RecruitmentAgency();

        EmployerSubscriber employerObserver = new EmployerSubscriber(agency.employer);

        ArrayList<Role> jobs = new ArrayList<>();
        jobs.add(Role.SOFTWARE_DEVELOPER);
        jobs.add(Role.DATABASE_ADMINISTRATOR);
        employerObserver.setJobs(jobs);

        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(Skills.APP_DEVELOPMENT);
        skills.add(Skills.JAVA_PROGRAMMING);
        skills.add(Skills.JAVASCRIPT);

        JobseekerSubscriber jobseeker = new JobseekerSubscriber(agency.jobseeker, Role.DATABASE_ADMINISTRATOR, skills);

        employerObserver.setJob(Role.SOFTWARE_DEVELOPER);
        JobseekerSubscriber jobseeker2 = new JobseekerSubscriber(agency.jobseeker, Role.SOFTWARE_DEVELOPER, skills);

    }
}
