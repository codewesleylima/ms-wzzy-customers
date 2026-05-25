package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
    Optional<Profile> findByCustomerId(String customerId);
}
