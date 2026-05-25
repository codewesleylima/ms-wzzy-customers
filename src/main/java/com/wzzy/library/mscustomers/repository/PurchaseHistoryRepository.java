package com.wzzy.library.mscustomers.repository;

import com.wzzy.library.mscustomers.entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, String> {
    List<PurchaseHistory> findByCustomerId(String customerId);
    List<PurchaseHistory> findByCustomerIdAndBookId(String customerId, String bookId);
}
