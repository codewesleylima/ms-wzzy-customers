package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Long customerIdDTO;
    private Long userIdDTO;
    private String firstNameDTO;
    private String lastNameDTO;
    private String phoneDTO;
    private LocalDate dateOfBirthDTO;
    private LocalDateTime registrationDateDTO;
    private String statusDTO;
    private java.util.List<AddressDTO> addressesDTO;
    private java.util.List<FavoriteDTO> favoritesDTO;
    private PreferenceDTO preferenceDTO;
    private java.util.List<PurchaseHistoryDTO> purchaseHistoryDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
