package com.fan.autobean;

public class AutoBean1 {
    private String name;

    public AutoBean1() {
        this.name = "autoBean1";
    }

    public AutoBean1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AutoBean1{" +
                "name='" + name + '\'' +
                '}';
    }
}
