package com.intern.system.mapper.sql;

import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class SqlMapperSql {


    public String getTableSql(String table){
        return new SQL(){{
            SELECT("name");
            FROM("${table}");
            WHERE("id=1");
        }}.toString();
    }


}
