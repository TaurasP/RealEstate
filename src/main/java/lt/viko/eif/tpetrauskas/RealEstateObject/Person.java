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
public class Person{
    private String name;
    private String surname;
    private String email;
    private int phone;
}
