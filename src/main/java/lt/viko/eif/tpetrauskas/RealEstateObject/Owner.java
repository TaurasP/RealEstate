package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Owner entity is used for owner's creation.
 * It is a child entity of a parent Person entity.
 */
@Getter
@Setter
@NoArgsConstructor
public class Owner extends Person{
    public Owner(String name, String surname, String email, int phone) {
        super(name, surname, email, phone);
    }
}
