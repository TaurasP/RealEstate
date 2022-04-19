package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Contract {
    private String number;
    private boolean isSigned;
    private Date signedDate;
    private Date startDate;
    private Date endDate;
    private List<Owner> ownersList;
    private List<Tenant> tenantsList;

    @Override
    public String toString() {
        return String.format("Contract: \n\t"
                        + "number = %s\n\t"
                        + "signed = %b\n\t"
                        + "signed date = %s\n\t"
                        + "start date = %s\n\n\t"
                        + "end date = %s\n\n\t"
                        + "Owners: %s\n\t"
                        + "Tenants: %s\n\t",
                number, isSigned, signedDate, startDate, endDate, printOwners(), printTenants());
    }

    private Object printOwners() {
        String result = "";
        for(Owner owner : ownersList) {
            result = String.format("\n\t\towner: \n\t\t\t"
                            + "name = %s\n\t\t\t"
                            + "surname = %s\n\t\t\t"
                            + "email = %s\n\t\t"
                            + "phone = %s\n\t\t",
                    owner.getName(), owner.getSurname(), owner.getEmail(), owner.getPhone());
        }
        return result;
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
    }
}
