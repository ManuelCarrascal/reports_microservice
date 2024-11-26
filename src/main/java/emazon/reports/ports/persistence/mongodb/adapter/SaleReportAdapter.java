package emazon.reports.ports.persistence.mongodb.adapter;

import emazon.reports.domain.model.SaleReport;
import emazon.reports.domain.spi.ISaleReportPersistencePort;
import emazon.reports.ports.persistence.mongodb.entity.SaleReportEntity;
import emazon.reports.ports.persistence.mongodb.mapper.ISaleReportEntityMapper;
import emazon.reports.ports.persistence.mongodb.repository.ISaleReportRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class SaleReportAdapter  implements ISaleReportPersistencePort {

    private final ISaleReportRepository saleReportRepository;
    private final ISaleReportEntityMapper saleReportEntityMapper;



    @Override
    public void generateReport(SaleReport saleReport) {
        SaleReportEntity saleReportEntity= saleReportEntityMapper.toEntity(saleReport);

        saleReportRepository.save(saleReportEntity);

    }
}