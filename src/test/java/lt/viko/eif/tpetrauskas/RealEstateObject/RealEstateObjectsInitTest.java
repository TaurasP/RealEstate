package lt.viko.eif.tpetrauskas.RealEstateObject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RealEstateObjectsInitTest {

    RealEstateObjectsInit realEstateObjectsInit = new RealEstateObjectsInit();

    @Test
    void getRealEstateObjectList() {
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

        assertNotNull(realEstateObjectsInit.getRealEstateObjectList());
        assertNotNull(realEstateObjectsInit.getOwnersList());
        assertNotNull(realEstateObjectsInit.getOwnersList2());
        assertNotNull(realEstateObjectsInit.getTenantsList());
        assertNotNull(realEstateObjectsInit.getOwnersList2());
        assertNotNull(realEstateObjectsInit.getContractsList());
        assertNotNull(realEstateObjectsInit.getContractsList2());
        assertNotNull(realEstateObjectsInit.getRoomsList1());
        assertNotNull(realEstateObjectsInit.getRoomsList2());
        assertNotNull(realEstateObjectsInit.getItemsList1());
        assertNotNull(realEstateObjectsInit.getItemsList2());
        assertNotNull(realEstateObjectsInit.getKeys1());
        assertNotNull(realEstateObjectsInit.getKeys2());
        assertNotNull(realEstateObjectsInit.getRealEstateObjectList().get(0));
        assertNotNull(realEstateObjectsInit.getRealEstateObjectList().get(1));

        assertEquals(obj1.getType(), realEstateObjectsInit.getRealEstateObjectList().get(0).getType());
        assertEquals(obj1.getPrice(), realEstateObjectsInit.getRealEstateObjectList().get(0).getPrice());
        assertEquals(obj1.getAddress(), realEstateObjectsInit.getRealEstateObjectList().get(0).getAddress());
        assertEquals(obj1.getSquareMeters(), realEstateObjectsInit.getRealEstateObjectList().get(0).getSquareMeters());
        assertEquals(obj1.getNumberOfFloors(), realEstateObjectsInit.getRealEstateObjectList().get(0).getNumberOfFloors());
        assertEquals(obj1.isWater(), realEstateObjectsInit.getRealEstateObjectList().get(0).isWater());
        assertEquals(obj1.isGas(), realEstateObjectsInit.getRealEstateObjectList().get(0).isGas());
        assertEquals(obj1.isElectricity(), realEstateObjectsInit.getRealEstateObjectList().get(0).isElectricity());
        assertEquals(obj1.isSewerage(), realEstateObjectsInit.getRealEstateObjectList().get(0).isSewerage());

        assertEquals(obj2.getType(), realEstateObjectsInit.getRealEstateObjectList().get(1).getType());
        assertEquals(obj2.getPrice(), realEstateObjectsInit.getRealEstateObjectList().get(1).getPrice());
        assertEquals(obj2.getAddress(), realEstateObjectsInit.getRealEstateObjectList().get(1).getAddress());
        assertEquals(obj2.getSquareMeters(), realEstateObjectsInit.getRealEstateObjectList().get(1).getSquareMeters());
        assertEquals(obj2.getNumberOfFloors(), realEstateObjectsInit.getRealEstateObjectList().get(1).getNumberOfFloors());
        assertEquals(obj2.isWater(), realEstateObjectsInit.getRealEstateObjectList().get(1).isWater());
        assertEquals(obj2.isGas(), realEstateObjectsInit.getRealEstateObjectList().get(1).isGas());
        assertEquals(obj2.isElectricity(), realEstateObjectsInit.getRealEstateObjectList().get(1).isElectricity());
        assertEquals(obj2.isSewerage(), realEstateObjectsInit.getRealEstateObjectList().get(1).isSewerage());
    }
}