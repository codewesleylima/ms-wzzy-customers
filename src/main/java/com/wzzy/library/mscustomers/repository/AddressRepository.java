package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    List<Address> findByCustomerId(String customerId);
    Address findByCustomerIdAndIsDefaultTrue(String customerId);
}
