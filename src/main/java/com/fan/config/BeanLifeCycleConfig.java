package com.fan.config;

import com.fan.bean.BeanLifeCycleMethod1;
import com.fan.bean.BeanLifeCycleMethod2;
import com.fan.bean.BeanLifeCycleMethod3;
import com.fan.bean.ForImportBean;
import com.fan.condition.FanImportBeanDefinitionRegistrar;
import com.fan.condition.FanImportSelector;
import org.springframework.context.annotation.*;

/*
* bean生命周期
* */
@Configuration
@ComponentScan(value = "com.fan.bean")
@Import(value = {FanImportBeanDefinitionRegistrar.class, FanImportSelector.class, ForImportBean.class})
public class BeanLifeCycleConfig {


    /**
     * bean的生命周期：
     * 		bean创建---初始化----销毁的过程
     * 容器管理bean的生命周期；
     * 我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
     *
     * 构造（对象创建）
     * 		单实例：在容器启动的时候创建对象
     * 		多实例：在每次获取的时候创建对象\
     *
     * BeanPostProcessor.postProcessBeforeInitialization
     * 初始化：
     * 		对象创建完成，并赋值好，调用初始化方法。。。
     * BeanPostProcessor.postProcessAfterInitialization
     * 销毁：
     * 		单实例：容器关闭的时候
     * 		多实例：容器不会管理这个bean；容器不会调用销毁方法；
     *
     *
     * 遍历得到容器中所有的BeanPostProcessor；挨个执行beforeInitialization，
     * 一但返回null，跳出for循环，不会执行后面的BeanPostProcessor.postProcessorsBeforeInitialization
     *
     * BeanPostProcessor原理
     * populateBean(beanName, mbd, instanceWrapper);给bean进行属性赋值
     * initializeBean
     * {
     * applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
     * invokeInitMethods(beanName, wrappedBean, mbd);执行自定义初始化
     * applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
     *}
     *
     *
     *
     * 1）、指定初始化和销毁方法；
     * 		通过@Bean指定init-method和destroy-method；构造器方法 -> init -> destroy
     * 2）、通过让Bean实现InitializingBean（定义初始化逻辑），
     * 				DisposableBean（定义销毁逻辑）;
     * 			1、2同时使用  2 -> 1
     * 3）、可以使用JSR250；
     * 		@PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
     * 		@PreDestroy：在容器销毁bean之前通知我们进行清理工作
     * 	        1、2、3同时使用 	3 -> 2 -> 1
     * 4）、BeanPostProcessor【interface】：bean的后置处理器；
     * 		在bean初始化前后进行一些处理工作；
     * 		postProcessBeforeInitialization:在初始化之前工作
     * 		postProcessAfterInitialization:在初始化之后工作
     *      1、2、3、4 同时使用先调用 构造器方法 -> postProcessBeforeInitialization -> 3、2、1 初始化方法
     *      -> postProcessAfterInitialization -> 3、2、1 销毁方法
     *
     * Spring底层对 BeanPostProcessor 的使用；
     * 		bean赋值，注入其他组件，@Autowired，生命周期注解功能，@Async,xxx BeanPostProcessor;
     *
     * @author fxw
     *
     */

    @Bean(value = "bean1",initMethod = "init",destroyMethod = "destroy")
    public BeanLifeCycleMethod1 beanLifeCycleMethod1() {
        return new BeanLifeCycleMethod1();
    }

    @Bean(value = "bean2",initMethod = "init",destroyMethod = "destroy2")
    public BeanLifeCycleMethod2 beanLifeCycleMethod2() {
        return new BeanLifeCycleMethod2();
    }

    @Scope("prototype")
    @Bean(value = "bean3",initMethod = "init",destroyMethod = "destroy3")
    public BeanLifeCycleMethod3 beanLifeCycleMethod3() {
        return new BeanLifeCycleMethod3();
    }


}
