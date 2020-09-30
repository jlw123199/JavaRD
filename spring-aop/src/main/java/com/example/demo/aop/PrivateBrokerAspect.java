package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @desc: 经纪人切面
 * @author: CSH
 **/
@Aspect
@Component
public class PrivateBrokerAspect {

    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     *通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * com.example.demo.aop.AopController.*(..)))")
    public void BrokerAspect(){

    }

    /**
    * @description  在连接点执行之前执行的通知
    */

    @Before("@annotation(com.example.demo.aop.NeedAop)")
    public void doBeforeGame(JoinPoint pjp){
        String class_name = pjp.getTarget().getClass().getName();
        String method_name = pjp.getSignature().getName();
        Object[] method_args = pjp.getArgs();

        System.out.println("---------");
        System.out.println(class_name + "--" +method_name + "---" + method_args.length );
    }



}
