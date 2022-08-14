package com.intern.system.service.Impl;

import com.intern.system.dao.pojo.JsonResult;
import com.intern.system.mapper.SqlMapper;
import com.intern.system.service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("rawtypes")
public class SqlServiceImpl implements SqlService {
    @Autowired
    SqlMapper sqlMapper;

    public JsonResult getTable(String table) {
        String str= sqlMapper.getTable(table);
//        StringBuilder stringBuilder=new StringBuilder();
//        for (Object object:list){
//            stringBuilder.append(object.toString()).append("\n");
//        }

        return JsonResult.success(str);
    }
}
