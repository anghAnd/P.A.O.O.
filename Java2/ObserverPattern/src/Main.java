//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Event bal = new Event ("Balul Bobocilor UCV");

      ClientObs client1 = new ClientObs("Dan");
      ClientObs client2 = new ClientObs("Alina");
      ClientObs client3 = new ClientObs("Marius");

      bal.addClient(client1);
      bal.addClient(client2);
      bal.addClient(client3);

        bal.notifyClients("Biletele sunt acum disponibile!");

        bal.removeClients(client2);

        bal.notifyClients("Concertul s-a mutat la o locație mai mare!");
    }
}