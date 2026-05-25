package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    FavoriteDTO addFavorite(FavoriteDTO favoriteDTO);
    FavoriteDTO getFavoriteById(String id);
    List<FavoriteDTO> getFavoritesByCustomerId(String customerId);
    void removeFavorite(String id);
    boolean isFavorite(String customerId, String bookId);
}
