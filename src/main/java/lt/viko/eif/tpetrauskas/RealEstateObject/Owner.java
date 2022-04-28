package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Parasyti dokumentacija
 */
@Getter
@Setter
@NoArgsConstructor
public class Owner extends Person{
    public Owner(String name, String surname, String email, int phone) {
        super(name, surname, email, phone);
    }

    public String toString() {
        return String.format("Owners: \n\t"
                        + "name = %s\n\t\t\t"
                        + "surname = %s\n\t\t\t"
                        + "email = %s\n\t\t\t"
                        + "phone = %s\n\t\t",
                this.getName(), this.getSurname(), this.getEmail(), this.getPhone());
    }
}
