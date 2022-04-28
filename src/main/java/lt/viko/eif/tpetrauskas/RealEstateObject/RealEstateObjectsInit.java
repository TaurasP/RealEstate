package lt.viko.eif.tpetrauskas.RealEstateObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * RealEstateObjectsInit is an entity used to create, initialize data for real estate objects
 */
public class RealEstateObjectsInit {
    List<RealEstateObject> realEstateObjectList = new ArrayList<>();

    List<Owner> ownersList = new ArrayList<>();
    List<Owner> ownersList2 = new ArrayList<>();

    List<Tenant> tenantsList = new ArrayList<>();
    List<Tenant> tenantsList2 = new ArrayList<>();

    List<Contract> contractsList = new ArrayList<>();
    List<Contract> contractsList2 = new ArrayList<>();

    List<Room> roomsList1 = new ArrayList<>();
    List<Room> roomsList2 = new ArrayList<>();

    List<Item> itemsList1 = new ArrayList<>();
    List<Item> itemsList2 = new ArrayList<>();

    List<Key> keys1 = new ArrayList<>();
    List<Key> keys2 = new ArrayList<>();

    /**
     * Gets list of real estate objects
     *
     * @return list of real estate objects
     */
    public List<RealEstateObject> getRealEstateObjectList() {
        ownersList.add(new Owner("Petras", "Petraitis", "petras.petraitis@gmail.com", 860000001));
        ownersList2.add(new Owner("Jonas", "Jonaitis", "jonas.jonaitis@gmail.com", 860000002));

        tenantsList.add(new Tenant("Matas", "Berzas", "matas.berzas@gmail.com", 860000003));
        tenantsList.add(new Tenant("Liepa", "Berze", "liepa.berze@gmail.com", 860000004));
        tenantsList2.add(new Tenant("Rima", "Kazlauskiene", "rima.kazlauskiene@gmail.com", 860000005));
        tenantsList2.add(new Tenant("Monika", "Asadauskaite", "monika.asadauskaite@gmail.com", 860000006));

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

        contractsList.add(new Contract("LT20220501-01", true, signedDate1.getTime(), startDate1.getTime(), endDate1.getTime(), tenantsList));
        contractsList2.add(new Contract("LT20220501-02", true, signedDate1.getTime(), startDate1.getTime(), endDate1.getTime(), tenantsList));

        keys1.add(new Key(11100012, 3));
        keys1.add(new Key(1000002323, 2));

        RealEstateObject obj1 = new RealEstateObject("namas", 200000f, "Vilniaus g. 1",
                120.50f, 2, true, true, true, true, ownersList, tenantsList, contractsList, roomsList1, itemsList1, keys1);
        RealEstateObject obj2 = new RealEstateObject("butas", 150000f, "Kauno g. 2",
                70.68f, 1, true, true, true, true, ownersList2, tenantsList2, contractsList2, roomsList2, itemsList2, keys2);

        realEstateObjectList.add(obj1);
        realEstateObjectList.add(obj2);

        return realEstateObjectList;
    }
}
