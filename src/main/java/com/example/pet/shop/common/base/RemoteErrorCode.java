package com.example.pet.shop.common.base;

public interface RemoteErrorCode {
    String C0001 = "C0001";  //调用第三方服务出错

    String C0100 = "C0100";  //中间件服务出错
    String C0200 = "C0200";  //第三方系统执行超时
    String C0300 = "C0300";  //数据库服务出错
    String C0400 = "C0400";  //第三方容灾系统被触发
    String C0500 = "C0500";  //通知服务出错
}
