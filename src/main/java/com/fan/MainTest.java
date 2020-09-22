package com.fan;

import com.fan.bean.BeanLifeCycleMethod1;
import com.fan.bean.BeanLifeCycleMethod3;
import com.fan.bean.FanHongYang;
import com.fan.condition.FanFactoryBean;
import com.fan.config.BeanLifeCycleConfig;
import com.fan.config.FanAutowireConfig;
import com.fan.config.FanConfig;
import com.fan.config.PropertiesConfig;
import com.fan.tx.TxConfig;
import com.fan.tx.TxService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        TxService txService = (TxService)context.getBean("txService");
        txService.insert();
    }
}
