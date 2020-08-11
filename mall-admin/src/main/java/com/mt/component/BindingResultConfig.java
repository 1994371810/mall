package com.mt.component;

import com.mt.api.CommonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by 郭俊旺 on 2020/8/10 10:45
 *
 * @author 郭俊旺
 */
@Component
@Aspect
public class BindingResultConfig {

    @Pointcut("execution(public * com.mt.controller.*.*(..))")
    public void controllerPointCut(){};

    @Around("controllerPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object[] args = proceedingJoinPoint.getArgs();

        for(Object argument : args){

            if(argument instanceof BindingResult){

                BindingResult result = (BindingResult) argument;

                //如果bindingResult内有异常 说明校验失败
                if(result.hasFieldErrors()){
                    FieldError fieldError = result.getFieldError();
                    //返回检验信息
                    return CommonResult.validateFailed(fieldError.getDefaultMessage());
                }
            }
        }
        return proceedingJoinPoint.proceed();
    }

}
