package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseHistoryIdEntity;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerEntity;

    @Column(nullable = false)
    private Long bookIdEntity;

    @Column(nullable = false)
    private LocalDateTime purchaseDateEntity = LocalDateTime.now();

    @Column(nullable = false)
    private Integer quantityEntity;

    @Column(nullable = false)
    private BigDecimal priceEntity;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
