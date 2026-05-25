package com.wzzy.library.mscustomers.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscustomers.dto.CustomerDTO;
import com.wzzy.library.mscustomers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<ApiResponse<CustomerDTO>> createCustomer(@RequestBody CustomerDTO customerDTO) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<CustomerDTO>> getCustomerById(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<ApiResponse<CustomerDTO>> getCustomerByUserId(@PathVariable String userId) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<PaginationDTO<CustomerDTO>>> getAllCustomers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CustomerDTO>> updateCustomer(
            @PathVariable String id,
            @RequestBody CustomerDTO customerDTO) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteCustomer(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }
}
