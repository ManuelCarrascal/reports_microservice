package emazon.reports.infrastructure.configuration.beanconfiguration;

import emazon.reports.domain.api.ISaleReportServicePort;
import emazon.reports.domain.api.usecase.SaleSaleReportUseCase;
import emazon.reports.domain.spi.IAuthenticationPersistencePort;
import emazon.reports.domain.spi.ISaleReportPersistencePort;
import emazon.reports.infrastructure.configuration.util.JwtService;
import emazon.reports.ports.persistence.mongodb.adapter.AuthenticationAdapter;
import emazon.reports.ports.persistence.mongodb.adapter.SaleReportAdapter;
import emazon.reports.ports.persistence.mongodb.mapper.ISaleReportEntityMapper;
import emazon.reports.ports.persistence.mongodb.repository.ISaleReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {

    @Bean
    public ISaleReportPersistencePort saleReportPersistencePort(ISaleReportRepository saleReportRepository, ISaleReportEntityMapper saleReportEntityMapper) {
        return new SaleReportAdapter(saleReportRepository, saleReportEntityMapper);
    }

    @Bean
    public IAuthenticationPersistencePort authenticationPersistencePort(JwtService jwtService) {
        return new AuthenticationAdapter(jwtService);
    }

    @Bean
    public ISaleReportServicePort saleReportServicePort(IAuthenticationPersistencePort authenticationPersistencePort, ISaleReportPersistencePort saleReportPersistencePort) {
        return new SaleSaleReportUseCase(authenticationPersistencePort,saleReportPersistencePort);
    }
}
