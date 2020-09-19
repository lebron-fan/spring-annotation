package com.fan.bean;

public class BeanLifeCycleMethod1 {
    private String name;

    public BeanLifeCycleMethod1() {
        this.name = "Bean1";
        System.out.println("Bean1构造器调用");
    }

    static {
        System.out.println("Bean1静态代码块");
    }

    {
        System.out.println("Bean1普通代码块");
    }

    public void init() {
        System.out.println(name + "  init()方法调用");
    }

    @Override
    public String toString() {
        return "BeanLifeCycleMethod1{" +
                "name='" + name + '\'' +
                '}';
    }

    public void destroy() {
        System.out.println(name + "  destroy()方法调用");
    }
}
