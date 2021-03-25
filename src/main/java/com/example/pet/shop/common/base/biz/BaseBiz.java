package com.example.pet.shop.common.base.biz;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import javax.annotation.Resource;

@Log4j2
public abstract class BaseBiz {

    @Getter
    @Resource
    private BusinessLogger businessLogger;
}
