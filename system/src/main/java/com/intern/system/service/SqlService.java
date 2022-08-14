package com.intern.system.service;

import com.intern.system.dao.pojo.JsonResult;
@SuppressWarnings("rawtypes")
public interface SqlService {
    public JsonResult getTable(String table);
}
