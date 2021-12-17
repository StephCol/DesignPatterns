package Observer.Problem;


public class PublisherDriver {
    public static void main(String[] args) {

        RecruitmentAgency agency = new RecruitmentAgency();
        agency.createEmployer();
        agency.createJobseeker();

        Jobseeker jobseeker = new Jobseeker(agency);
        jobseeker.setRole(JobTitle.SOFTWARE_DEVELOPER);
        jobseeker.setSkill(Skills.APP_DEVELOPMENT);

        Employer employer = new Employer(agency);
        employer.setJob(JobTitle.PROJECT_MANAGER);
        employer.setJob(JobTitle.DATABASE_ADMINISTRATOR);

        agency.registerEmployer(employer);
        agency.registerJobseeker(jobseeker);

        agency.setNotification("New jobseeker added with " + jobseeker.getRole()
                        + " role and the following skills: " + jobseeker.getSkills());


        agency.setNotification("New employer added, seeking jobseekers with following roles: " + employer.getJobs());

    }
}
