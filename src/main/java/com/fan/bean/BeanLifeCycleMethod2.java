package com.fan.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleMethod2 implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public String toString() {
        return "BeanLifeCycleMethod2{" +
                "name='" + name + '\'' +
                '}';
    }

    {
        System.out.println("Bean2普通代码块");
    }

    public BeanLifeCycleMethod2() {
        this.name = "Bean2";
        System.out.println("Bean2构造器调用");
    }

    static {
        System.out.println("Bean2静态代码块");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(name + "  bean2的销毁方法调用了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name + "  afterPropertiesSet()调用了");
    }

    public void init() {
        System.out.println(name + "  init()方法调用");
    }

    public void destroy2() {
        System.out.println(name + "  destroy2()方法调用");
    }
}
