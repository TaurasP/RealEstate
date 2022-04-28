package lt.viko.eif.tpetrauskas.RealEstateObject;

public class RealEstateObjectThread{

    public void runServer() {
        Thread serverThread = new Thread(() -> {
            Server server = new Server();
            server.run();
        });
        serverThread.start();
    }

    public void runClient() {
        Thread clientThread = new Thread(() -> {
            Client client = new Client();
            client.run();
        });
        clientThread.start();
    }
}
