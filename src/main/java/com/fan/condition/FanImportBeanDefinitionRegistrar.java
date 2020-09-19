package com.fan.condition;

import com.fan.bean.ImportSelectorBean1And2;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class FanImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata：当前类的注解信息
     * BeanDefinitionRegistry:BeanDefinition注册类；
     * 		把所有需要添加到容器中的bean；调用
     * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean hasBean2 = beanDefinitionRegistry.containsBeanDefinition("com.fan.bean.ImportSelectorBean2");
        boolean hasBean1 = beanDefinitionRegistry.containsBeanDefinition("com.fan.bean.ImprotSelectorBean1");
        if (hasBean1 && hasBean2) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportSelectorBean1And2.class);
            beanDefinitionRegistry.registerBeanDefinition("bean1And2",rootBeanDefinition);
        }
    }
}
