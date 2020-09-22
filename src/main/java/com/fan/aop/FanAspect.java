package com.fan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect //声明是个切面类
public class FanAspect {

    @Pointcut("execution(public int com.fan.aop.FanCalculator.calculate(..))")
    public void pointCut() {}


    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before调用了");
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println(name);
        System.out.println(Arrays.asList(args));
    }

    //出现异常也会调用
    @After(value = "pointCut()")
    public void after() {
        System.out.println("after调用了");
    }

    //正常返回调用 joinPoint参数放第一个
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result) {
        System.out.println("afterReturning调用了");
        System.out.println(joinPoint.getSignature().getName()+"-----"+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception) {
        System.out.println("afterThrowing掉用了");
        System.out.println(exception);
    }

}
