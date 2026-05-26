package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistoryDTO {

    private Long id;
    private Long customerId;
    private Long bookId;
    private LocalDateTime purchaseDate;
    private Integer quantity;
    private BigDecimal price;
}
