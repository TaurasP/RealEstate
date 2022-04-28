package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Tenant entity is used for tenant's creation.
 * It is a child entity of a parent Person entity.
 */
@Getter
@Setter
@NoArgsConstructor
public class Tenant extends Person{
    public Tenant(String name, String surname, String email, int phone) {
        super(name, surname, email, phone);
    }
}
