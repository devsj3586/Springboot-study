package com.example.fintech.contact.dto;


public class SubscribeDto {
    private String email;

    public SubscribeDto () {}

    public SubscribeDto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SubscribeDto{" +
                "email='" + email + '\'' +
                '}';
    }
}
