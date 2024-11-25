package emazon.reports.ports.persistence.mongodb.entity;

import emazon.reports.domain.model.SaleDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "reports")
public class SaleReportEntity {
    @MongoId
    private String id;
    @Indexed
    private String userEmail;
    private String creationDate;
    @Indexed
    private Double totalAmount;
    private List<SaleDetails> saleDetails;
    @Indexed
    private Date saleDate;


}
