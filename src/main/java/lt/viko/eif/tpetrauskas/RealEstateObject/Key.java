package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Parasyti dokumentacija
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Key {
    private int id;
    private int numberOfCopies;

    @Override
    public String toString() {
        return String.format("Key: \n\t"
                        + "id = %d\n\t"
                        + "number of copies = %d\n\t",
                                id, numberOfCopies);
    }
}
