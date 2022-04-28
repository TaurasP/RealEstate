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
 * Contract entity is used for contract's creation and to show which tenants are a part of a contract.
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
}
