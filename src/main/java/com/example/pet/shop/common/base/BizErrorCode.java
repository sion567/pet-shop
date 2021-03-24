package com.example.pet.shop.common.base;

public interface BizErrorCode {
    String A0001 = "A0001";  //用户端错误

    String A0100 = "A0100";  //用户注册错误
    String A0150 = "A0150";  //用户基本信息校验失败
    String A0151 = "A0151";  //手机格式校验失败
    String A0152 = "A0152";  //地址格式校验失败

    String A0200 = "A0200";  //用户登录异常
    String A0201 = "A0201";  //用户账户不存在

    String A0300 = "A0300";  //访问权限异常
    String A0301 = "A0301";  //访问未授权

    String A0400 = "A0400";  //用户请求参数错误
    String A0401 = "A0401";  //包含非法恶意跳转链接
    String A0402 = "A0402";  //无效的用户输入
    String A0410 = "A0410";  //请求必填参数为空

    String A0500 = "A0500";  //用户请求服务异常
    String A0501 = "A0501";  //请求次数超出限制
    String A0502 = "A0502";  //请求并发数超出限制
    String A0503 = "A0503";  //用户操作请等待
    String A0504 = "A0504";  //WebSocket连接异常
    String A0505 = "A0505";  //WebSocket连接断开
    String A0506 = "A0506";  //用户重复请求

    String A0600 = "A0600";  //用户资源异常
    String A0601 = "A0601";  //账户余额不足
    String A0602 = "A0602";  //用户磁盘空间不足

    String A0700 = "A0700";  //用户上传文件异常
    String A0701 = "A0701";  //用户上传文件类型不匹配
    String A0702 = "A0702";  //用户上传文件太大
    String A0703 = "A0703";  //用户上传图片太大
    String A0704 = "A0704";  //用户上传视频太大
    String A0705 = "A0705";  //用户上传压缩文件太大


    String A0800 = "A0800";  //用户当前版本异常
    String A0900 = "A0900";  //用户隐私未授权
    String A1000 = "A1000";  //用户设备异常
}
