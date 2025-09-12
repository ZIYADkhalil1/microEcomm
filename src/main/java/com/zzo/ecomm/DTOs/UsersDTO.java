package com.zzo.ecomm.DTOs;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UsersDTO {
	
	private Long id;
	private String firstName;
	private String lastName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String postalCode;
    private String email;
    private String passwordHash;
    private Boolean isActive = true;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
