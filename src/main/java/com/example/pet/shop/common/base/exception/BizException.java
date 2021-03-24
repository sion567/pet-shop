package com.example.pet.shop.common.base.exception;

import com.example.pet.shop.common.base.ErrorCode;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = -8634700792767837033L;

    public ErrorCode errorCode;

    public BizException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}