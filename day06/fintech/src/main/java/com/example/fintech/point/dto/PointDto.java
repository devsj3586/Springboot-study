package com.example.fintech.point.dto;

public class PointDto {
    private String email;
    private int amount;
    private String uid;

    public PointDto () {}

    public PointDto(String email, int amount, String uid) {
        this.email = email;
        this.amount = amount;
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "PointDto{" +
                "email='" + email + '\'' +
                ", amount=" + amount +
                ", uid='" + uid + '\'' +
                '}';
    }
}
