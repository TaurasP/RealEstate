package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        RealEstateObjectsInit init = new RealEstateObjectsInit();
        init.getRealEstateObjectList();

        FromAndToXML fromAndToXML = new FromAndToXML();
        fromAndToXML.transformToXML(init.getRealEstateObjectList().get(0));
        fromAndToXML.transformToPOJO();
    }
}
