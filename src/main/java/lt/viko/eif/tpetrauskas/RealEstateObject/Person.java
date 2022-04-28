package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Person entity is a parent entity for Owner and Tenant entities.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person{
    private String name;
    private String surname;
    private String email;
    private int phone;
}
