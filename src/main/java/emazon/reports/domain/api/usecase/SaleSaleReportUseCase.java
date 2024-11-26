package emazon.reports.domain.api.usecase;

import emazon.reports.domain.api.ISaleReportServicePort;
import emazon.reports.domain.model.Sale;
import emazon.reports.domain.model.SaleReport;
import emazon.reports.domain.spi.IAuthenticationPersistencePort;
import emazon.reports.domain.spi.ISaleReportPersistencePort;

public class SaleSaleReportUseCase implements ISaleReportServicePort {

    private final IAuthenticationPersistencePort authenticationPersistencePort;
    private final ISaleReportPersistencePort saleReportPersistencePort;

    public SaleSaleReportUseCase(IAuthenticationPersistencePort authenticationPersistencePort, ISaleReportPersistencePort saleReportPersistencePort) {
        this.authenticationPersistencePort = authenticationPersistencePort;
        this.saleReportPersistencePort = saleReportPersistencePort;
    }


    @Override
    public void generateReport(Sale sale) {
        Long userId = authenticationPersistencePort.getAuthenticatedUserId();
        String email = authenticationPersistencePort.getAuthenticatedUserEmail();
        SaleReport saleReport = new SaleReport();
        saleReport.setUserId(userId);
        saleReport.setUserEmail(email);
        saleReport.setSaleDetails(sale.getSaleDetails());
        saleReport.setTotalAmount(sale.getTotal());
        saleReport.setSaleDate(sale.getCreatedAt());
        saleReportPersistencePort.generateReport(saleReport);
    }
}
