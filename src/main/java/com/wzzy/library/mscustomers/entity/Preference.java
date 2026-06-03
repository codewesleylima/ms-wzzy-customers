package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "preferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferenceIdEntity;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerEntity;

    private String preferredGenreEntity;

    private BigDecimal maxPriceEntity;

    @Column(nullable = false)
    private Boolean notificationEnabledEntity = true;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
