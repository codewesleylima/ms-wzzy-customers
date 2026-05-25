package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistoryDTO {
    private String id;
    private String customerId;
    private String orderId;
    private String bookId;
    private String bookTitle;
    private BigDecimal purchasePrice;
    private int quantity;
    private String purchasedAt;
}
