package com.microservice.Account.repository;

import com.microservice.Account.entity.Accounts;
import com.microservice.Account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Modifying
    @Transactional
    void deleteByCustomerId(Long customerId);

}
