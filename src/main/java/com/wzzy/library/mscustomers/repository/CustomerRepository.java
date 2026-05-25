package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findByUserId(String userId);
    Optional<Customer> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByUserId(String userId);
}
