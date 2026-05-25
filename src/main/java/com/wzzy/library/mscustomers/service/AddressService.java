package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO);
    AddressDTO getAddressById(String id);
    List<AddressDTO> getAddressesByCustomerId(String customerId);
    AddressDTO updateAddress(String id, AddressDTO addressDTO);
    void deleteAddress(String id);
    void setDefaultAddress(String customerId, String addressId);
}
