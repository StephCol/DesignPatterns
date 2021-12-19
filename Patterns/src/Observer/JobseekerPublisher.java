package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobseekerPublisher implements AgencyPublisher {

        private static List<AgencySubscriber> jobseekers;

        public JobseekerPublisher(){
            jobseekers = new ArrayList<>();
        }

        @Override
        public void registerClient(AgencySubscriber client) {
            jobseekers.add(client);
            EmployerPublisher.notifyClients(client);
        }

        public static void notifyClients(AgencySubscriber client){
            for(AgencySubscriber jobseeker : jobseekers)
                if(isRelevantNotification(client, jobseeker))
                    jobseeker.update("New job openings matching your title");

        }

        private static boolean isRelevantNotification(AgencySubscriber employer, AgencySubscriber jobseeker){
            return ((EmployerSubscriber)employer).getJobs().contains(((JobseekerSubscriber)jobseeker).getRole());

        }
}
