package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.PreferenceDTO;
import com.wzzy.library.mscustomers.enums.PreferenceType;

import java.util.List;

public interface PreferenceService {
    PreferenceDTO createPreference(PreferenceDTO preferenceDTO);
    PreferenceDTO getPreferenceById(String id);
    List<PreferenceDTO> getPreferencesByCustomerId(String customerId);
    PreferenceDTO getPreferenceByCustomerIdAndType(String customerId, PreferenceType preferenceType);
    PreferenceDTO updatePreference(String id, PreferenceDTO preferenceDTO);
    void deletePreference(String id);
}
