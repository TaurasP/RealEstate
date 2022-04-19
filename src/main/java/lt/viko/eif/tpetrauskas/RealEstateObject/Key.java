package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Key {
    private String name;
    private int numberOfCopies;

    @Override
    public String toString() {
        return String.format("Key: \n\t"
                        + "name = %s\n\t"
                        + "number of copies = %d\n\t",
                name, numberOfCopies);
    }
}
