package com.wzzy.library.mscustomers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "favorites")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favoriteIdEntity;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerEntity;

    @Column(nullable = false)
    private Long bookIdEntity;

    @Column(nullable = false)
    private LocalDateTime addedDateEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
