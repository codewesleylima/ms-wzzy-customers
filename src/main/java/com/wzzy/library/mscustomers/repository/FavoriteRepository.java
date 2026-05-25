package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, String> {
    List<Favorite> findByCustomerId(String customerId);
    Optional<Favorite> findByCustomerIdAndBookId(String customerId, String bookId);
    boolean existsByCustomerIdAndBookId(String customerId, String bookId);
}
