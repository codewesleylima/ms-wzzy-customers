package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferenceDTO {

    private Long id;
    private Long customerId;
    private String preferredGenre;
    private BigDecimal maxPrice;
    private Boolean notificationEnabled;
}
