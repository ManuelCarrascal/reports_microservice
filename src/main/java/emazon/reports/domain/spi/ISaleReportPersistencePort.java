package emazon.reports.domain.spi;

import emazon.reports.domain.model.SaleReport;

public interface ISaleReportPersistencePort {
    void generateReport(SaleReport saleReport);

}
