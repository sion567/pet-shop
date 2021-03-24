package com.example.pet.shop.common.base.biz;

import com.example.pet.shop.common.base.util.JsonMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * 打印业务日志，格式为:
 *
 * 日期,实体类型,操作类型 ,操作用户,json格式的扩展字段
 *
 * @author calvin
 */
@Component
@Log4j2(topic = "business")
public class BusinessLogger {

    private JsonMapper jsonMapper = new JsonMapper();

    public void log(String entity, String action, String user, @SuppressWarnings("rawtypes") Map data) {
        String json = (data != null ? jsonMapper.toJson(data) : "{}");
        log.info("{},{},{},{}", entity, action, user, json);
    }
}
