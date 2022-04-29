package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.Getter;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;

/**
 * FromAndToXML is an entity used for marshaling, un-marshaling
 */
@Getter
public class FromAndToXML {
    private JAXBContext jaxbContext = JAXBContext.newInstance(RealEstateObject.class);
    private StringWriter xmlWriter = new StringWriter();
    private String fileNameXML = "real-estate-object.xml";
    private String fileNameXSD = "real-estate-object.xsd";

    public FromAndToXML() throws JAXBException {
    }

    /**
     * Performs marshaling, saves data to XML file and outputs result to a console
     *
     * @param realEstateObject a real estate object
     */
    public void transformToXML(RealEstateObject realEstateObject) throws JAXBException {
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(realEstateObject, new File(fileNameXML));
        jaxbMarshaller.marshal(realEstateObject, xmlWriter);
        System.out.println(xmlWriter);
    }

    /**
     * Performs un-marshaling from a file and outputs result to a console
     */
    public void transformToPOJO() {
        File xmlFile = new File(fileNameXML);
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

    /**
     * Validates XML against XSD Schema
     *
     * @return true if XML is validated successfully
     */
    public boolean validateXMLSchema(String xsdPath, String xmlPath){
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
            return false;
        }catch(SAXException e1){
            System.out.println("SAX Exception: " + e1.getMessage());
            return false;
        }
        return true;
    }
}
