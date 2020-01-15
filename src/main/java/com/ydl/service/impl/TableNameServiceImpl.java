package com.ydl.service.impl;

import com.ydl.entity.TableName;
import com.ydl.mapper.TableNameMapper;
import com.ydl.service.TableNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableNameServiceImpl implements TableNameService {
    @Autowired
    TableNameMapper tableNameMapper;
    @Override
    public List getTableName(TableName tableName) {
        return tableNameMapper.getTableName(tableName);
    }

    @Override
    public List getColumnName(TableName tableName) {
        return tableNameMapper.getColumnName(tableName);
    }

    @Override
    public List getDataByColumn(TableName tableName) {
        return tableNameMapper.getDataByColumn(tableName);
    }
}
