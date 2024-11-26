package emazon.reports.ports.persistence.mongodb.mapper;

import emazon.reports.domain.model.SaleReport;
import emazon.reports.ports.persistence.mongodb.entity.SaleReportEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISaleReportEntityMapper {

    SaleReportEntity toEntity(SaleReport saleReport);
}
