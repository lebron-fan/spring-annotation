package com.fan;

import com.fan.bean.BeanLifeCycleMethod1;
import com.fan.bean.BeanLifeCycleMethod3;
import com.fan.bean.FanHongYang;
import com.fan.condition.FanFactoryBean;
import com.fan.config.BeanLifeCycleConfig;
import com.fan.config.FanAutowireConfig;
import com.fan.config.FanConfig;
import com.fan.config.PropertiesConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(PropertiesConfig.class);
        context.refresh();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        context.close();
    }
}
