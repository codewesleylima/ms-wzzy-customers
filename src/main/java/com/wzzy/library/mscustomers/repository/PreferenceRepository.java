package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.Preference;
import com.wzzy.library.mscustomers.enums.PreferenceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, String> {
    List<Preference> findByCustomerId(String customerId);
    Optional<Preference> findByCustomerIdAndPreferenceType(String customerId, PreferenceType preferenceType);
}
