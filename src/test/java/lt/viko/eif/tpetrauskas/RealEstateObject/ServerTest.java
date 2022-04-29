package lt.viko.eif.tpetrauskas.RealEstateObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {

    private String fileNameXML = "real-estate-object.xml";
    private int port = 3333;
    private Server server = new Server();

    @Test
    void run() {
        assertNotNull(server.getFileNameXML());
        assertEquals(fileNameXML, server.getFileNameXML());
        assertEquals(port, server.getPort());
    }
}