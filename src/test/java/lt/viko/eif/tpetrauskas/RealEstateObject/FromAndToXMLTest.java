package lt.viko.eif.tpetrauskas.RealEstateObject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;

import static org.junit.jupiter.api.Assertions.*;

class FromAndToXMLTest {

    private String fileNameXML = "real-estate-object.xml";
    private String fileNameXSD = "real-estate-object.xsd";
    private FromAndToXML fromAndToXML = new FromAndToXML();

    FromAndToXMLTest() throws JAXBException {
    }

    @Test
    @DisplayName("Ensure marshaling, save data to XML and output to console works")
    void transformToXML() {
        assertNotNull(fromAndToXML.getFileNameXML());
        assertEquals(fileNameXML, fromAndToXML.getFileNameXML());
    }

    @Test
    void transformToPOJO() {
        assertNotNull(fromAndToXML.getFileNameXML());
        assertEquals(fileNameXML, fromAndToXML.getFileNameXML());
    }
}