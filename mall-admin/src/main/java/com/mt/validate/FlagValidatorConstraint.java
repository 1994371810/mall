package com.mt.validate;

import cn.hutool.core.util.StrUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class FlagValidatorConstraint implements ConstraintValidator<FlagValidator,Integer> {

    private String[] values;
    @Override
    public void initialize(FlagValidator flagValidator) {
        this.values = flagValidator.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        if(value==null){
            return false;
        }

        for(int i =0 ;i<values.length;i++){
            if(Objects.equals(values[i],String.valueOf(value))){
                return true;
            }
        }
        return false;
    }
}
