package emazon.reports.domain.api;

import emazon.reports.domain.model.Sale;

public interface ISaleReportServicePort {
        void generateReport(Sale sale);
}
