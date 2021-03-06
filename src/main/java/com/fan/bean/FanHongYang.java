package com.fan.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

public class FanHongYang {

    @Value("樊红羊二比")
    private String name;

    @Value("不男不女")
    private String gender;

    public String getName() {
        return name;
    }

    public FanHongYang(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public FanHongYang() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FanHongYang that = (FanHongYang) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "FanHongYang{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
