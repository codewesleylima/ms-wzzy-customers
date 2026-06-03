package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressIdEntity;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerEntity;

    @Column(nullable = false)
    private String streetEntity;

    @Column(nullable = false)
    private String cityEntity;

    private String stateEntity;

    @Column(nullable = false)
    private String zipCodeEntity;

    @Column(nullable = false)
    private String countryEntity;

    @Column(nullable = false)
    private Boolean isDefaultEntity = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
