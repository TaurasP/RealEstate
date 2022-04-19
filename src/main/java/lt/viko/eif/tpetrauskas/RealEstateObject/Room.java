package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Room {
    private String name;
    private String condition;
    private String description;
    private List<Item> itemsList;

    @Override
    public String toString() {
        return String.format("Room: \n\t"
                        + "name = %s\n\t"
                        + "condition = %s\n\t"
                        + "description = %s\n\n\t"
                        + "Items: %s\n\t",
                name, condition, description, printItems());
    }

    private Object printItems() {
        String result = "";
        for(Item item : itemsList) {
            result = String.format("\n\t\titem: \n\t\t\t"
                            + "name = %s\n\t\t\t"
                            + "condition = %s\n\t\t\t"
                            + "description = %s\n\t\t",
                            item.getName(), item.getCondition(), item.getDescription());
        }
        return result;
    }
}
