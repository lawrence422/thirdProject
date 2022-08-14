package com.intern.system.controller;

import com.intern.system.dao.pojo.JsonResult;
import com.intern.system.service.SqlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@SuppressWarnings("rawtypes")
@RequestMapping("/system")
public class SystemController {
    @Autowired
    SqlService sqlService;

    @PostMapping("/getTable")
    public JsonResult getTable(String table){
        log.info("getTable << (String: "+table+")");
        JsonResult temp=sqlService.getTable(table);
        log.info("getTable >> (JsonResult: "+table+")");
        return temp;
    }

    @GetMapping("/test")
    public JsonResult test(){
        log.info("getTable << ( )");
        JsonResult temp=JsonResult.success("test");
        log.info("getTable >> (JsonResult: "+temp+")");
        return temp;
    }
}
