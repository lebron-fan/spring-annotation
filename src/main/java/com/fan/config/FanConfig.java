package com.fan.config;

import com.fan.bean.FanHongYang;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//声明为配置类
@Configuration
//@ComponentScan(value = {"com.fan"},excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})
//})
/**
 * 添加组件方式之一 包扫描@Component + @Controller/@Service等
 * **/
@ComponentScans(value = {
//        @ComponentScan(value = "com.fan",includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Service.class})
//        },useDefaultFilters = false)
        @ComponentScan(value = "com.fan")
})

//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件，需要添加useDefaultFilters = false
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class  FanConfig {

    /**
     * 给容器中注册组件；
     * 1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2）、@Bean[导入的第三方包里面的组件]
     * 3）、@Import[快速给容器中导入一个组件]
     * 		1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     * 		2）、ImportSelector:返回需要导入的组件的全类名数组；
     * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）、使用Spring提供的 FactoryBean（工厂Bean）;
     * 		1）、默认获取到的是工厂bean调用getObject创建的对象
     * 		2）、要获取工厂Bean本身，我们需要给id前面加一个&
     * 			&colorFactoryBean
     */
    @Bean(value = "yang")
    public FanHongYang fanHongYang() {
        return new FanHongYang("樊红羊不要脸","女");
    }
}



