package com.fan.autobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;

public class AutoBean2 {


    private AutoBean1 autoBean1;

    private String name;

    public AutoBean2(AutoBean1 autoBean1, String name) {
        this.autoBean1 = autoBean1;
        this.name = name;
    }

    public AutoBean2() {
        this.name = "autoBean2";
    }

    @Override
    public String toString() {
        return "AutoBean2{" +
                "autoBean1=" + autoBean1 +
                ", name='" + name + '\'' +
                '}';
    }
}
