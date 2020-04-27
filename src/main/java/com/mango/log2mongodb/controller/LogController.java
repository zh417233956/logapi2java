//package com.mango.log2mongodb.controller;
//
//public class LogController {
//}

package com.mango.log2mongodb.controller;


import com.mango.log2mongodb.entity.LogInfo;
import com.mango.log2mongodb.service.LogInfoService;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.bcel.internal.generic.RET;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Log日志API
 *
 */
@Slf4j
@RestController
@RequestMapping(value="/log")
public class LogController {

    @Autowired
    LogInfoService logInfoService;


    @RequestMapping("/read/{id}")
    public LogInfo read(@PathVariable String id) {
        //"2a17b146d96d40689ff890da17066e59"
        LogInfo logInfo= logInfoService.getLogById(id);

        log.info(JSON.toJSONString(logInfo));
        //return JSON.toJSONString(logInfo);
        return  logInfo;
    }
    @PostMapping("/write")
    public LogInfo write(@RequestBody LogInfo logInfo) {
        LogInfo _logInfo = logInfoService.insertLog(logInfo);
        log.info(JSON.toJSONString(_logInfo));
        return  _logInfo;
    }

}

