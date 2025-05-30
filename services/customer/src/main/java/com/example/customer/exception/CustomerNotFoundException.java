package com.example.customer.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data

public class CustomerNotFoundException extends Exception {
    private final String msg;
}
