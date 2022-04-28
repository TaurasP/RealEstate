package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBException;

/**
 * This is a main method of this application
 * It creates and runs threads for client and server
 * It performs marshaling, validates XML against XSD schema, saves data to XML file and outputs result to a console
 * It sends file from client to server, performs un-marshaling and outputs result to a console
 * For operations is used real estate object
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        RealEstateObjectThread thread = new RealEstateObjectThread();
        RealEstateObjectsInit init = new RealEstateObjectsInit();
        FromAndToXML fromAndToXML = new FromAndToXML();

        fromAndToXML.transformToXML(init.getRealEstateObjectList().get(0));
        fromAndToXML.validateXMLSchema(fromAndToXML.getFileNameXSD(), fromAndToXML.getFileNameXML());
        thread.runServer();
        thread.runClient();

    }
}
