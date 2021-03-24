package com.example.pet.shop.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class IntListValueConstraintValidator implements ConstraintValidator<IntListValue, Integer> {

    private Set<Integer> valueSet;

    /**
     * 初始化方法，可以拿到这个注解
     *
     * @param constraintAnnotation 这个注解
     */
    @Override
    public void initialize(IntListValue constraintAnnotation) {
        valueSet = new HashSet<>();

        int[] values = constraintAnnotation.values();

        for (int value : values) {
            valueSet.add(value);
        }
    }

    /**
     * 校验方法
     *
     * @param value 要校验的值
     * @return 值是否在 valueSet 中，值为空则不判断
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return value == null || valueSet.contains(value);
    }
}
