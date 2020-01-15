package com.ydl.api.bigDataPlatform.economicData;

import com.ydl.annotation.UserLoginToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.service.economicData.EconomicDataService;
import com.ydl.service.economicData.GDPStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/GDPStatistics")
//生产总值统计
public class GDPStatisticsApi {
    @Autowired
    EconomicDataService economicDataService;
    @Autowired
    GDPStatisticsService grossProductService;


//    @PostMapping(value = "/getDataByTableName")
//    public Object data(@RequestBody 生产总值统计 grossProduct) {
//        System.out.println(grossProduct.getTableName());
//     return grossProductService.getDataByTableName(grossProduct);
//    }

    /**
     * @apiName GDPStatistics_getDataByTableName
     * @api {POST} GDPStatistics/getDataByTableName 生产总值统计
     * @apiGroup 经济数据
     * @apiVersion 0.0.2
     * @apiDescription 用于获取生产总值统计的数据
     * @apiParam {JSON} tableName 表名字
     * @apiParamExample {json} 请求样例：
     * {
     * "tableName":"玉林市历年兴业县生产总值统计1998_2016"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     * [
     * {
     * "编号": 1,
     * "年份": 1998,
     * "地区生产总值万元": 154275,
     * "地区生产总值第一产业万元": 93129,
     * "地区生产总值第二产业万元": 29417,
     * "第二产业工业万元": 22393,
     * "第二产业建筑业万元": 7024,
     * "地区生产总值第三产业万元": 31729,
     * "交通运输仓储邮政业万元": 7673,
     * "批发零售住宿餐饮业万元": null
     * },
     * {
     * "编号": 2,
     * "年份": 1999,
     * "地区生产总值万元": 160081,
     * "地区生产总值第一产业万元": 93941,
     * "地区生产总值第二产业万元": 29343,
     * "第二产业工业万元": 23149,
     * "第二产业建筑业万元": 6194,
     * "地区生产总值第三产业万元": 36797,
     * "交通运输仓储邮政业万元": 8586,
     * "批发零售住宿餐饮业万元": null
     * }
     * ]
     */
    @UserLoginToken
    @PostMapping(value = "/getDataByTableName")
    public Object data(@RequestBody Map<String, Object> models) throws Exception {
        EconomicData economicData = JsonXMLUtils.map2obj((Map<String, Object>) models.get("economicdata"), EconomicData.class);
        System.out.println(economicData.getTableName());
        return grossProductService.getDataByTableName(economicData);
    }
}
