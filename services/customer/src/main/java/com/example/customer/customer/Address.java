package com.example.customer.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Builder
@Data
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;


}
