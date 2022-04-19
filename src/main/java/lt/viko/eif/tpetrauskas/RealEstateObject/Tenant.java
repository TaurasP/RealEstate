package lt.viko.eif.tpetrauskas.RealEstateObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Parasyti dokumentacija
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Tenant extends Person{
    private List<Contract> contractList;
}
