package emazon.reports.ports.persistence.mongodb.repository;

import emazon.reports.ports.persistence.mongodb.entity.SaleReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ISaleReportRepository  extends MongoRepository<SaleReportEntity,String> {


}
