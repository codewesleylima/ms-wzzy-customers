package com.wzzy.library.mscustomers.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.mscustomers.dto.ProfileDTO;
import com.wzzy.library.mscustomers.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public ResponseEntity<ApiResponse<ProfileDTO>> createProfile(@RequestBody ProfileDTO profileDTO) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<ApiResponse<ProfileDTO>> getProfileByCustomerId(@PathVariable String customerId) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<ProfileDTO>> updateProfile(
            @PathVariable String id,
            @RequestBody ProfileDTO profileDTO) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteProfile(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }
}
