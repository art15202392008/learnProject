package com.learn.rule.dto;

import java.util.Objects;

public class RuleDto {
    private String address;
    private int age;

    public RuleDto() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RuleDto ruleDto = (RuleDto) o;
        return age == ruleDto.age && Objects.equals(address, ruleDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, age);
    }
}
