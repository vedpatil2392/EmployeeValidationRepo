package com.validation.CRUDvalidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100 characters")
    private String name;

    @NotBlank(message = "Address is mandatory")
    @Size(min = 5, max = 255, message = "Address should be between 5 and 255 characters")
    private String address;

    @NotBlank(message = "City is mandatory")
    @Size(min = 2, max = 100, message = "City should be between 2 and 100 characters")
    private String city;

    @NotBlank(message = "Mobile number is mandatory")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @NotBlank(message = "Adhar number is mandatory")
    @Pattern(regexp = "^\\d{12}$", message = "Adhar number must be 12 digits")
    private String adharNo;

}

