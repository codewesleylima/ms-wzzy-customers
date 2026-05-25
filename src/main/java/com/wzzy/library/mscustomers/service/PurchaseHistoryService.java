package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.PurchaseHistoryDTO;

import java.util.List;

public interface PurchaseHistoryService {
    PurchaseHistoryDTO recordPurchase(PurchaseHistoryDTO purchaseHistoryDTO);
    List<PurchaseHistoryDTO> getPurchaseHistoryByCustomerId(String customerId);
    List<PurchaseHistoryDTO> getPurchaseHistoryByBookId(String customerId, String bookId);
}
