package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferenceDTO {

    private Long preferenceIdDTO;
    private Long customerIdDTO;
    private String preferredGenreDTO;
    private BigDecimal maxPriceDTO;
    private Boolean notificationEnabledDTO;
}
