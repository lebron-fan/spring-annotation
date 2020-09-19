package com.fan;

import com.fan.bean.BeanLifeCycleMethod1;
import com.fan.bean.BeanLifeCycleMethod3;
import com.fan.bean.FanHongYang;
import com.fan.condition.FanFactoryBean;
import com.fan.config.BeanLifeCycleConfig;
import com.fan.config.FanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        context.close();
    }
}
