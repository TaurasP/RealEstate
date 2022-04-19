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
public class Owner extends Person{
    private List<RealEstateObject> realEstateObjectsList;
    private List<Contract> contractsList;
}
