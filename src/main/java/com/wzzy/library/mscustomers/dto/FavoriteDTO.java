package com.wzzy.library.mscustomers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDTO {

    private Long favoriteIdDTO;
    private Long customerIdDTO;
    private Long bookIdDTO;
    private LocalDateTime addedDateDTO;
}
