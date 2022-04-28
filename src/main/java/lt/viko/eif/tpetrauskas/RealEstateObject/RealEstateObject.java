package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RealEstateObject {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private float price;
    @XmlAttribute
    private String address;
    @XmlAttribute
    private float squareMeters;
    @XmlAttribute
    private int numberOfFloors;
    @XmlAttribute
    private boolean isWater;
    @XmlAttribute
    private boolean isGas;
    @XmlAttribute
    private boolean isElectricity;
    @XmlAttribute
    private boolean isSewerage;
    @XmlElement(name = "owner")
    private List<Owner> ownerList;
    @XmlElement(name = "tenant")
    private List<Tenant> tenantList;
    @XmlElement(name = "contract")
    private List<Contract> contractList;
    @XmlElement(name = "room")
    private List<Room> roomsList;
    @XmlElement(name = "item")
    private List<Item> itemsList;
    @XmlElement(name = "key")
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
                            + "Owners: %s\n\n\t"
                            + "Contracts: %s\n\t"
                            + "Rooms: %s\n\n\t"
                            + "Keys: %s\n\t",
                            type, price, address, squareMeters, numberOfFloors, isWater, isGas, isElectricity, isSewerage, printOwners(), printContracts(), printRooms(), printKeys());
    }

    private Object printOwners() {
        String result = "";
        for(Owner owner : ownerList) {
            result += String.format("\n\t\towner: \n\t\t\t"
                            + "name = %s\n\t\t\t"
                            + "surname = %s\n\t\t\t"
                            + "email = %s\n\t\t\t"
                            + "phone = %s\t\t\t",
                    owner.getName(), owner.getSurname(), owner.getEmail(), owner.getPhone());
        }
        return result;
    }

    private Object printTenants() {
        String result = "";
        for(Tenant tenant : tenantList) {
            result += String.format("\n\t\t\ttenant: \n\t\t\t\t"
                            + "name = %s\n\t\t\t\t"
                            + "surname = %s\n\t\t\t\t"
                            + "email = %s\n\t\t\t\t"
                            + "phone = %s\t\t\t\t",
                    tenant.getName(), tenant.getSurname(), tenant.getEmail(), tenant.getPhone());
        }
        return result;
    }

    private Object printContracts() {
        String result = "";
        for(Contract contract : contractList) {
            result += String.format("\n\t\tcontract: \n\t\t\t"
                            + "number = %s\n\t\t\t"
                            + "signed = %b\n\t\t\t"
                            + "signed date = %s\n\t\t\t"
                            + "start date = %s\n\t\t\t"
                            + "end date = %s\n\t\t\t"
                            + "\n\t\tTenants: %s\n\t",
                    contract.getNumber(), contract.isSigned(), contract.getSignedDate(), contract.getStartDate(),
                    contract.getEndDate(), printTenants());
        }
        return result;
    }

    private Object printRooms() {
        String result = "";
        for(Room room : roomsList) {
            result += String.format("\n\t\troom: \n\t\t\t"
                                    + "name = %s\n\t\t\t"
                                    + "condition = %s\n\t\t\t"
                                    + "description = %s\n\n\t\t\t"
                                    + "Items: %s\t\t\t",
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
                            + "description = %s\t\t\t\t\t",
                    item.getName(), item.getCondition(), item.getDescription());
        }
        return result;
    }

    private Object printKeys() {
        String result = "";
        for(Key key : keysList) {
            result += String.format("\n\t\tkey: \n\t\t\t"
                            + "id = %d\n\t\t\t"
                            + "number of copies = %d\t\t\t",
                    key.getId(), key.getNumberOfCopies());
        }
        return result;
    }
}
