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

    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate dateOfBirth;
    private LocalDateTime registrationDate;
    private String status;
}
