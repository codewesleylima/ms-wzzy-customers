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

    private Long purchaseHistoryIdDTO;
    private Long customerIdDTO;
    private Long bookIdDTO;
    private LocalDateTime purchaseDateDTO;
    private Integer quantityDTO;
    private BigDecimal priceDTO;
}
