package lt.viko.eif.tpetrauskas.RealEstateObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
public class Main {
    public static void main(String[] args) throws JAXBException {
        List<RealEstateObject> realEstateObjectList = new ArrayList<>();

        List<Owner> ownersList = new ArrayList<>();

        List<Tenant> tenantsList = new ArrayList<>();

        List<Contract> contractsList = new ArrayList<>();

        List<Room> roomsList1 = new ArrayList<>();
        List<Room> roomsList2 = new ArrayList<>();

        List<Item> itemsList1 = new ArrayList<>();
        List<Item> itemsList2 = new ArrayList<>();

        List<Key> keys1 = new ArrayList<>();
        List<Key> keys2 = new ArrayList<>();

        itemsList1.add(new Item("stalas", "puiki", ""));
        itemsList1.add(new Item("sofa", "puiki", "odine rudos spalvos"));
        itemsList2.add(new Item("tv", "puiki", ""));
        itemsList2.add(new Item("torseras", "gera", ""));

        roomsList1.add(new Room("svetaine", "puiki", "", itemsList1));
        roomsList1.add(new Room("darbo kambarys", "puiki", "", itemsList1));
        roomsList2.add(new Room("vonia", "puiki", "", itemsList2));

        Calendar signedDate1 = Calendar.getInstance();
        signedDate1.set(2022, 5, 1);
        Calendar startDate1 = Calendar.getInstance();
        startDate1.set(2022, 5, 1);
        Calendar endDate1 = Calendar.getInstance();
        endDate1.set(2023, 4, 30);

        contractsList.add(new Contract("LT20220501-01", true, signedDate1.getTime(), startDate1.getTime(), endDate1.getTime(), ownersList, tenantsList));

        keys1.add(new Key(roomsList1.get(0).getName(), 1));
        keys1.add(new Key(roomsList1.get(1).getName(), 2));



        RealEstateObject obj1 = new RealEstateObject("namas", 200000f, "Vilniaus g. 1",
                120.50f, 2, true, true, true, true, roomsList1, itemsList1, keys1);
        RealEstateObject obj2 = new RealEstateObject("butas", 150000f, "Kauno g. 2",
                70.68f, 1, true, true, true, true, roomsList2, itemsList2, keys2);

        realEstateObjectList.add(obj1);
        realEstateObjectList.add(obj2);

        /*for (RealEstateObject object: realEstateObjectList) {
            System.out.println(object);
        }*/

        //Owner owner1 = new Owner("Vardenis", "Pavardenis");
        //owner1.addRealEstateObjects(obj1);

        FromAndToXML fromAndToXML = new FromAndToXML();
        fromAndToXML.transformToXML(obj1);
        fromAndToXML.transformToPOJO();
    }
}
