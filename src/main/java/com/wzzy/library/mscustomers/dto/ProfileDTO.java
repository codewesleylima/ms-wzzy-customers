package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDTO {
    private String id;
    private String customerId;
    private String dateOfBirth;
    private String gender;
    private String profileImageUrl;
    private String bio;
    private String createdAt;
    private String updatedAt;
}
