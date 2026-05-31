package com.wzzy.library.mscustomers.dto;

import com.wzzy.library.mscustomers.enums.CustomersEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomersDTO {

    @Id
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String dateOfBirth;
    private String registrationDate;
    private CustomersEnum customersEnum;

}