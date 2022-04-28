package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class FromAndToXML {
    private JAXBContext jaxbContext = JAXBContext.newInstance(RealEstateObject.class);
    private StringWriter xmlWriter = new StringWriter();
    private String fileName = "real-estate-object.xml";

    public FromAndToXML() throws JAXBException {
    }

    // MARSHALING
    public void transformToXML(RealEstateObject realEstateObject) throws JAXBException {
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(realEstateObject, new File(fileName));
}

    // UNMARSHALING
    public void transformToPOJO() {
        File xmlFile = new File(fileName);

        try
        {
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            RealEstateObject realEstateObject = (RealEstateObject) jaxbUnmarshaller.unmarshal(xmlFile);
            System.out.println(realEstateObject);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
