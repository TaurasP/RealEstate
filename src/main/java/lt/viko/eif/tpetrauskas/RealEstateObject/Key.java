package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Parasyti dokumentacija
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Key {
    @XmlAttribute
    private int id;
    @XmlAttribute
    private int numberOfCopies;

    /*@Override
    public String toString() {
        return String.format("Key: \n\t"
                        + "id = %d\n\t"
                        + "number of copies = %d\n\t",
                                id, numberOfCopies);
    }*/
}
