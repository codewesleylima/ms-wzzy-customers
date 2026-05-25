package com.wzzy.library.mscustomers.dto;

import com.wzzy.library.mscustomers.enums.PreferenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreferenceDTO {
    private String id;
    private String customerId;
    private PreferenceType preferenceType;
    private String value;
    private String description;
    private String createdAt;
    private String updatedAt;
}
