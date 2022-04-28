package lt.viko.eif.tpetrauskas.RealEstateObject;

/**
 * RealEstateObjectThread is an entity used to run client and server in separate threads.
 */
public class RealEstateObjectThread{
    /**
     * Runs server in a separate thread
     */
    public void runServer() {
        Thread serverThread = new Thread(() -> {
            Server server = new Server();
            server.run();
        });
        serverThread.start();
    }

    /**
     * Runs client in a separate thread
     */
    public void runClient() {
        Thread clientThread = new Thread(() -> {
            Client client = new Client();
            client.run();
        });
        clientThread.start();
    }
}
