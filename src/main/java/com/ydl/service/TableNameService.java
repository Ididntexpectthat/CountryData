package com.ydl.service;

import com.ydl.entity.TableName;
import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public interface TableNameService {
    /**
     * 获取大数据表的名字
     */
    List getTableName(TableName tableName);

    /**
     * 获取某个大数据表的所有字段名
     */
    List getColumnName(TableName tableName);

    /**
     * 依据表名和字段名获取数据
     */
    List getDataByColumn(TableName tableName);
}
