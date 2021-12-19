package Observer;

import Observer.Problem.JobTitle;

import java.util.ArrayList;
import java.util.List;

public class EmployerPublisher implements AgencyPublisher {

    private static List<AgencySubscriber> employers;

    public EmployerPublisher(){
        employers = new ArrayList<>();
    }

    @Override
    public void registerClient(AgencySubscriber client) {
        employers.add(client);
    }


    public static void notifyClients(AgencySubscriber client){
        for(AgencySubscriber employer : employers)
            if(isRelevantNotification(employer, client))
            employer.update("New " + ((JobseekerSubscriber)client).getRole()
                    + " matching current job opening. Skills include:"
                    + ((JobseekerSubscriber)client).getSkills().toString());
    }

    private static boolean isRelevantNotification(AgencySubscriber employer, AgencySubscriber jobseeker){
        return ((EmployerSubscriber)employer).getJobs().contains(((JobseekerSubscriber)jobseeker).getRole());

    }
}
