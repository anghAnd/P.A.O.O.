import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<Client> clients = new ArrayList<>();
    private String eventName;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    // Adaugă un client la lista de abonați
    public void addClient(Client client) {
        clients.add(client);
    }

    // Șterge un client din lista de abonați
    public void removeClients(Client client) {
        clients.remove(client);
    }

    // Notifică toți clienții despre o schimbare
    public void notifyClients(String message) {
        for (Client client : clients) {
            client.update("🔔 " + eventName + ": " + message);
        }
    }
}
