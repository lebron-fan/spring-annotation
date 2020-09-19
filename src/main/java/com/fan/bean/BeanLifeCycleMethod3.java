package com.fan.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleMethod3 implements InitializingBean, DisposableBean {
    private String name;

    public BeanLifeCycleMethod3() {
        this.name = "bean3";
    }

    @Override
    public String toString() {
        return "BeanLifeCycleMethod3{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println(name + "  init()方法调用");
    }

    public void destroy3() {
        System.out.println(name + "  destroy3()方法调用");
    }

    @PostConstruct
    public void init3() {
        System.out.println(name + " PostConstruct init3()调用了");
    }

    @PreDestroy
    public void destroy33() {
        System.out.println(name + " PreDestroy destroy33调用了");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(name + " DisableBean destroy()调用了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name + " afterPropertiesSet()调用了");
    }
}
