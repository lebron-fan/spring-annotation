package com.fan.config;

import com.fan.bean.FanXiaoWen;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({@PropertySource(value = "classpath:/fan.properties")})
//@PropertySource(value = "classpath:/fan.properties")
@ComponentScan(value = "com.fan")
public class PropertiesConfig {

    @Profile(value = "test")
    @Bean
    public FanXiaoWen fanXiaoWen() {
        return new FanXiaoWen();
    }
}
