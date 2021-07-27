package com.learn.rule.dto;

public class NationalityRuleDto {

    private String nationality;

    private String address;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NationalityRuleDto{" +
                "nationality='" + nationality + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
