package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDTO {
    private String id;
    private String customerId;
    private String bookId;
    private String bookTitle;
    private String createdAt;
}
