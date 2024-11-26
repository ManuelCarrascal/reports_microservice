package emazon.reports.ports.persistence.mongodb.adapter;

import emazon.reports.domain.spi.IAuthenticationPersistencePort;
import emazon.reports.infrastructure.configuration.util.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@RequiredArgsConstructor
public class AuthenticationAdapter implements IAuthenticationPersistencePort {

    private final JwtService jwtService;


    @Override
    public Long getAuthenticatedUserId() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Long.valueOf( userDetails.getUsername());
    }

    @Override
    public String getAuthenticatedUserEmail() {
        String jwt = (String) SecurityContextHolder.getContext().getAuthentication().getCredentials();
        return jwtService.extractEmail(jwt);
    }
}
