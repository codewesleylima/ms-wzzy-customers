package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDTO {

    private Long id;
    private Long customerId;
    private Long bookId;
    private LocalDateTime addedDate;
}
