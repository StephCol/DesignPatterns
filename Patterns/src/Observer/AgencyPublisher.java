package Observer;

public interface AgencyPublisher {
    void registerClient(AgencySubscriber client);
    static void notifyClients(AgencySubscriber client){}
    static boolean isRelevantNotification(AgencySubscriber employer, AgencySubscriber jobseeker) {
        return ((EmployerSubscriber)employer).getJobs().contains(((JobseekerSubscriber)jobseeker).getRole());

    }
}
