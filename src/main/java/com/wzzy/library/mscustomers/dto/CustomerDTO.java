package com.wzzy.library.mscustomers.dto;

import com.wzzy.library.mscustomers.enums.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private CustomerStatus status;
    private String cpf;
    private String cnpj;
    private String createdAt;
    private String updatedAt;
}
