package com.wzzy.library.mscustomers.service;

import com.wzzy.library.mscustomers.dto.*;

import java.util.List;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomerById(String id);
    CustomerDTO getCustomerByUserId(String userId);
    CustomerDTO updateCustomer(String id, CustomerDTO customerDTO);
    void deleteCustomer(String id);
    List<CustomerDTO> getAllCustomers();
}
