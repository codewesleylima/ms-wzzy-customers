package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdressEntity {

    @Id
    private UUID adressId;
    private String streat;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private Boolean isDefault;
}
