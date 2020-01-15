package com.ydl.api;

import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.Option;
import com.ydl.entity.TableName;
import com.ydl.service.TableNameService;
import com.ydl.utils.OptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/TableName")
public class TableNameApi {
    @Autowired
    TableNameService tableNameService;
    @Autowired
    OptionUtil optionUtil;
    @PostMapping("/getTableName")
    public List getTableName(@RequestBody Map<String,Object> models) throws Exception {
        TableName tableName = JsonXMLUtils.map2obj((Map<String,Object>)models.get("TableName"),TableName.class);
         List list = tableNameService.getTableName(tableName);
         return  optionUtil.getResult(list);
    }

    @PostMapping("/getColumnName")
    public List getColumnName(@RequestBody Map<String,Object> models) throws Exception {
        TableName tableName = JsonXMLUtils.map2obj((Map<String,Object>)models.get("TableName"),TableName.class);
        List list = tableNameService.getColumnName(tableName);
        return optionUtil.getResult1(list);
    }



    @PostMapping("/getDataByColumn")
    public List getDataByColumn(@RequestBody Map<String,Object> models) throws Exception {
        TableName tableName = JsonXMLUtils.map2obj((Map<String,Object>)models.get("TableName"),TableName.class);
        List list = tableNameService.getDataByColumn(tableName);
        return list;
    }
}
