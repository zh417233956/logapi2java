package com.mango.log2mongodb.service;

import com.mango.log2mongodb.entity.LogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class LogInfoService {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * 1、增
     * @param loginfo
     * @return
     */
    public LogInfo insertLog(LogInfo loginfo) {
        // 可以用 save 替代
        mongoTemplate.insert(loginfo);
        return loginfo;
    }

    /**
     * 2、查
     * @param id
     * @return
     */
    public LogInfo getLogById(@PathVariable String id) {
        return mongoTemplate.findById(id, LogInfo.class);
    }
}
