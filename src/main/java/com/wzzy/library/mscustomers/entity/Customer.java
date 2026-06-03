package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerIdEntity;

    @Column(nullable = false, unique = true)
    private Long userIdEntity;

    @Column(nullable = false)
    private String firstNameEntity;

    @Column(nullable = false)
    private String lastNameEntity;

    private String phoneEntity;

    private LocalDate dateOfBirthEntity;

    @Column(nullable = false)
    private LocalDateTime registrationDateEntity = LocalDateTime.now();

    @Column(nullable = false)
    private String statusEntity = "ACTIVE";

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private java.util.List<Address> addressesEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private java.util.List<Favorite> favoritesEntity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private Preference preferenceEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private java.util.List<PurchaseHistory> purchaseHistoryEntity;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
