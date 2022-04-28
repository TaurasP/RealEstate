package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBException;

/**
 * Parasyti dokumentacija
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        RealEstateObjectsInit init = new RealEstateObjectsInit();

        FromAndToXML fromAndToXML = new FromAndToXML();
        fromAndToXML.transformToXML(init.getRealEstateObjectList().get(0));
        fromAndToXML.transformToPOJO();
    }
}
