package emazon.reports.ports.application.http.mapper;

import emazon.reports.domain.model.Sale;
import emazon.reports.ports.application.http.dto.SaleRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ISaleRequestMapper {

    Sale toSale(SaleRequest saleRequest);
}
