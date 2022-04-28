package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Contract {
    @XmlElement
    private String number;
    @XmlElement
    private boolean isSigned;
    @XmlElement
    private Date signedDate;
    @XmlElement
    private Date startDate;
    @XmlElement
    private Date endDate;
    @XmlElement(name="tenant")
    private List<Tenant> tenantsList;

    /*@Override
    public String toString() {
        return String.format("\ncontract: \n\t"
                        + "number = %s\n\t"
                        + "signed = %b\n\t"
                        + "signed date = %s\n\t"
                        + "start date = %s\n\n\t"
                        + "end date = %s\n\n\t"
                        + "Tenants: %s\n\t",
                number, isSigned, signedDate, startDate, endDate, printTenants());
    }

    private Object printTenants() {
        String result = "";
        for(Tenant tenant : tenantsList) {
            result = String.format("\n\t\ttenant: \n\t\t\t"
                            + "name = %s\n\t\t\t"
                            + "surname = %s\n\t\t\t"
                            + "email = %s\n\t\t"
                            + "phone = %s\n\t\t",
                    tenant.getName(), tenant.getSurname(), tenant.getEmail(), tenant.getPhone());
        }
        return result;
    }*/
}
