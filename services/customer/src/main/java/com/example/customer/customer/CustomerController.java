package com.example.customer.customer;
import com.example.customer.customer.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    private final CustomerService service;
    @PostMapping
    public ResponseEntity<String> createCustomer(
     @RequestBody @Valid CustomerRequest   customerRequest
    )
    {
        return ResponseEntity.ok(service.createCustomer(customerRequest));

    }

}
