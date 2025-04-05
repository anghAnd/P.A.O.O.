public class ClientObs implements Client {
    private String name;

    public ClientObs(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventInfo) {
        System.out.println(name + " a primit notificarea: " + eventInfo);
    }
}
