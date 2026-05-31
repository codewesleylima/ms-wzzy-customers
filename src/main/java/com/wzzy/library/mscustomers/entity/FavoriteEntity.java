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
@Table(name = "favorite")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteEntity {

    @Id
    private UUID id;

    private Long customerId;
    private Long bookId;
    private java.time.LocalDateTime addedDate;

    public FavoriteEntity(Long customerId, Long bookId) {
        this.id = UUID.randomUUID();
        this.customerId = customerId;
        this.bookId = bookId;
        this.addedDate = java.time.LocalDateTime.now();
    }
}
