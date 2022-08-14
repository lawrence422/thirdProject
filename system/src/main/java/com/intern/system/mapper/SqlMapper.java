package com.intern.system.mapper;

import com.intern.system.mapper.sql.SqlMapperSql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;


@Mapper
public interface SqlMapper {

    @SelectProvider(type = SqlMapperSql.class, method ="getTableSql")
    String getTable(String table);
}
