package com.example.insurance.web.dto;

import lombok.Data;

@Data
public class UserRegistrarionDto {

    private String firstName;

    private String lastName;

    private String passport;
    private String email;

    private String number;

    private String password;

    public UserRegistrarionDto(){}

    public UserRegistrarionDto(String firstName, String lastName,String passport, String email, String number, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.email = email;
        this.number = number;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
