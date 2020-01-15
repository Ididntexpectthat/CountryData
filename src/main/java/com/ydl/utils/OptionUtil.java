package com.ydl.utils;

import com.ydl.entity.Option;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("OptionUtil")
public class OptionUtil {

    public List getResult(List list){
        List resultList = new ArrayList();
        int i = 1;
        for(Object s: list) {
            Option option = new Option();
            option.setLabel(s.toString());
            option.setValue("选项"+ i);
//            option.setLeaf("level === 0");
            resultList.add(option);
            i++;
        }
        return resultList;
    }
    public List getResult1(List list){
        List resultList = new ArrayList();
        int i = 1;
        for(Object s: list) {
            Option option = new Option();
            option.setLabel(s.toString());
            option.setValue("选项"+ i);
            option.setLeaf("level === 1");
            resultList.add(option);
            i++;
        }
        return resultList;
    }
}
