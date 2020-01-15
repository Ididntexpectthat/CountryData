package com.ydl.mapper;

import com.ydl.entity.TableName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("TableNameMapper")
public interface TableNameMapper {
    List getTableName(TableName tableName);

    List getColumnName(TableName tableName);

    List getDataByColumn(TableName tableName);
}
