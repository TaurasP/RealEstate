package lt.viko.eif.tpetrauskas.RealEstateObject;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private RealEstateObjectThread thread = new RealEstateObjectThread();
    private RealEstateObjectsInit init = new RealEstateObjectsInit();
    private FromAndToXML fromAndToXML = new FromAndToXML();

    MainTest() throws JAXBException {
    }

    @Test
    void main() {
        assertNotNull(init.getRealEstateObjectList().get(0));
        assertNotNull(init.getRealEstateObjectList().get(1));
        assertNotNull(fromAndToXML.getFileNameXSD());
        assertNotNull(fromAndToXML.getFileNameXML());
    }
}