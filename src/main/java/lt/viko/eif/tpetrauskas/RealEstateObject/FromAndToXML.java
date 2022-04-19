package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class FromAndToXML {
    private JAXBContext jaxbContext = JAXBContext.newInstance(RealEstateObject.class);
    private StringWriter xmlWriter = new StringWriter();
    public FromAndToXML() throws JAXBException {
    }

    // MARSHALING
    public void transformToXML(RealEstateObject realEstateObject) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(realEstateObject, xmlWriter);
        System.out.println(xmlWriter);
}

    // UNMARSHALING
    public void transformToPOJO() throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader xmlReader = new StringReader(xmlWriter.toString());
        RealEstateObject outREO = (RealEstateObject) unmarshaller.unmarshal(xmlReader);
        System.out.println(outREO);
    }
}
