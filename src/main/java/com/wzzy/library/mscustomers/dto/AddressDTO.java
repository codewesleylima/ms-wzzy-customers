package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private Long addressIdDTO;
    private Long customerIdDTO;
    private String streetDTO;
    private String cityDTO;
    private String stateDTO;
    private String zipCodeDTO;
    private String countryDTO;
    private Boolean isDefaultDTO;
}
