package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private String id;
    private String customerId;
    private String street;
    private String number;
    private String complement;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String addressType;
    private boolean isDefault;
    private String createdAt;
    private String updatedAt;
}
