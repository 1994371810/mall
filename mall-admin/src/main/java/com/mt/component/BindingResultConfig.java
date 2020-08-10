package com.mt.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.validation.BindingResult;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by 郭俊旺 on 2020/8/10 10:45
 *
 * @author 郭俊旺
 */

@Aspect
public class BindingResultConfig {

    @Pointcut("execution(public * com.mt.controller.*.*(..))")
    public void controllerPointCut(){};

    @Around("controllerPointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){

        Object[] args = proceedingJoinPoint.getArgs();
        for(Object argument : args){
            
        }

    }

}
