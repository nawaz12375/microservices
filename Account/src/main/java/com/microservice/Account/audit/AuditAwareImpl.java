package com.microservice.Account.audit;

import org.hibernate.annotations.Comment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditAwareImpl implements AuditorAware<String> {
    /**
     * @return
     */
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("ACCOUNT_MS");
    }
}
