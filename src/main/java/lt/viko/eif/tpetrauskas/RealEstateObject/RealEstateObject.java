package lt.viko.eif.tpetrauskas.RealEstateObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@XmlRootElement
public class RealEstateObject {
    private String type;
    private float price;
    private String address;
    private float squareMeters;
    private int numberOfFloors;
    private boolean isWater;
    private boolean isGas;
    private boolean isElectricity;
    private boolean isSewerage;
    private List<Room> roomsList;
    private List<Item> itemsList;
    private List<Key> keysList;

    @Override
    public String toString() {
        return String.format("Real estate object: \n\t"
                            + "type = %s\n\t"
                            + "price = %.2f Eur\n\t"
                            + "address = %s\n\t"
                            + "square meters = %.2f m2\n\t"
                            + "number of floors = %d\n\t"
                            + "water = %b\n\tgas = %b\n\t"
                            + "electricity = %b\n\t"
                            + "sewerage = %b\n\n\t"
                            + "Rooms: %s\n\t"
                            + "Keys: %s\n\t",
                            type, price, address, squareMeters, numberOfFloors, isWater, isGas, isElectricity, isSewerage, printRooms(), printKeys());
    }

    private Object printRooms() {
        String result = "";
        for(Room room : roomsList) {
            result += String.format("\n\t\troom: \n\t\t\t"
                                    + "name = %s\n\t\t\t"
                                    + "condition = %s\n\t\t\t"
                                    + "description = %s\n\n\t\t\t"
                                    + "Items: %s\n\t\t\t",
                                    room.getName(), room.getCondition(), room.getDescription(), printItems());
        }
        return result;
    }

    private Object printItems() {
        String result = "";
        for(Item item : itemsList) {
            result += String.format("\n\t\t\t\titem: \n\t\t\t\t\t"
                            + "name = %s\n\t\t\t\t\t"
                            + "condition = %s\n\t\t\t\t\t"
                            + "description = %s\n\t\t\t\t\t",
                    item.getName(), item.getCondition(), item.getDescription());
        }
        return result;
    }

    private Object printKeys() {
        String result = "";
        for(Key key : keysList) {
            result += String.format("\n\t\tkey: \n\t\t\t"
                            + "name = %s\n\t\t\t"
                            + "number of copies = %s\n\t\t\t",
                    key.getName(), key.getNumberOfCopies());
        }
        return result;
    }
}
