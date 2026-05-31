package com.wzzy.library.mscustomers.entity;

import com.wzzy.library.mscustomers.enums.CustomersEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
public class CustumersEntity {

    @Id
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String dateOfBirth;
    private String registrationDate;
    private CustomersEnum customersEnum;

}
