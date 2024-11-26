package emazon.reports.ports.application.http.controller;

import emazon.reports.domain.api.ISaleReportServicePort;
import emazon.reports.domain.model.Sale;
import emazon.reports.ports.application.http.dto.SaleRequest;
import emazon.reports.ports.application.http.mapper.ISaleRequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports/sale")
@CrossOrigin(origins = "${cors.allowed.origin}")
@RequiredArgsConstructor
public class SaleReportController {
    private final ISaleReportServicePort saleReportServicePort;
    private final ISaleRequestMapper saleRequestMapper;

    @PostMapping
    public void createSaleReport(@RequestBody SaleRequest saleRequest) {
        Sale sale = saleRequestMapper.toSale(saleRequest);
        saleReportServicePort.generateReport(sale);
    }
}
