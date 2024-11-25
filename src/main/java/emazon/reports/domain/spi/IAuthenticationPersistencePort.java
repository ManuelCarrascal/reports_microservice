package emazon.reports.domain.spi;


public interface IAuthenticationPersistencePort {
    Long getAuthenticatedUserId();
    String getAuthenticatedUserEmail();
}
