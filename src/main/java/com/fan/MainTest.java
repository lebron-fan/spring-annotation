package com.fan;

import com.fan.bean.BeanLifeCycleMethod1;
import com.fan.bean.BeanLifeCycleMethod3;
import com.fan.bean.FanHongYang;
import com.fan.config.BeanLifeCycleConfig;
import com.fan.config.FanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        BeanLifeCycleMethod3 bean = context.getBean(BeanLifeCycleMethod3.class);
        context.close();
    }
}
