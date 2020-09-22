package com.fan.service;

import com.fan.aop.FanCalculator;
import com.fan.config.FanAopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FanAopConfig.class);
        FanCalculator fanCalculate = (FanCalculator)context.getBean("fanCalculator");
        int num = fanCalculate.calculate(5, 2);
        System.out.println(num);
    }
}
