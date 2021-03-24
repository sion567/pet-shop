package com.example.pet.shop.conf;

import com.example.pet.shop.common.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;


@Configuration
public class UsernameAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
//        ServletRequestAttributes attr = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
//        attr.getRequest().getSession().getAttribute(Constants.CURRENT_USER);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            return null;
        }
        return Optional.of(authentication.getName());
    }
}
