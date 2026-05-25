package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.ProfileDTO;

public interface ProfileService {
    ProfileDTO createProfile(ProfileDTO profileDTO);
    ProfileDTO getProfileByCustomerId(String customerId);
    ProfileDTO updateProfile(String id, ProfileDTO profileDTO);
    void deleteProfile(String id);
}
