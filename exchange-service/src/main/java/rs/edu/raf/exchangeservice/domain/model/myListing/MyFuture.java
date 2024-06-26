package rs.edu.raf.exchangeservice.domain.model.myListing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "exchange_service_schema")
public class MyFuture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long myFutureId;
    private Long companyId;
    private String contractName;
    private Integer contractSize;
    private String contractUnit;
    private Integer maintenanceMargin;
    private String type;
    private String currencyMark;
    private Double price;
    private Boolean isPublic;
    @Version
    private Integer version;
}
