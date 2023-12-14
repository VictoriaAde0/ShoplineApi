package com.shopline.Shopline.Dto;
import jakarta.persistence.*;
public class CustomerDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;

    private String email;

    private Long phoneNumber;

    public CustomerDto() {
    }

    public CustomerDto( String name, String email, Long phoneNumber) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
