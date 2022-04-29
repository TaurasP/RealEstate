package lt.viko.eif.tpetrauskas.RealEstateObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private String fileNameXML = "real-estate-object.xml";
    private int port = 3333;
    private Client client = new Client();

    @Test
    void run() {
        assertNotNull(client.getFileNameXML());
        assertEquals(fileNameXML, client.getFileNameXML());
        assertEquals(port, client.getPort());
    }
}