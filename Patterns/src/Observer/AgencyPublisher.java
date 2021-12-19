package Observer;

public interface AgencyPublisher {
    void registerClient(AgencySubscriber client);
    static void notifyClients(AgencySubscriber client){}
}
