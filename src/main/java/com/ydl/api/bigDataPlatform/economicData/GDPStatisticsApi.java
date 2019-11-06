package com.ydl.api.bigDataPlatform.economicData;

import com.ydl.entity.economicData.EconomicData;
import com.ydl.service.economicData.EconomicDataService;
import com.ydl.service.economicData.GDPStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GDPStatistics")
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
     *{
     * 	"tableName":"经济数据.玉林市历年兴业县生产总值统计1998_2016"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     * [
     *     {
     *         "编号": 1,
     *         "年份": 1998,
     *         "地区生产总值万元": 154275,
     *         "地区生产总值第一产业万元": 93129,
     *         "地区生产总值第二产业万元": 29417,
     *         "第二产业工业万元": 22393,
     *         "第二产业建筑业万元": 7024,
     *         "地区生产总值第三产业万元": 31729,
     *         "交通运输仓储邮政业万元": 7673,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 2,
     *         "年份": 1999,
     *         "地区生产总值万元": 160081,
     *         "地区生产总值第一产业万元": 93941,
     *         "地区生产总值第二产业万元": 29343,
     *         "第二产业工业万元": 23149,
     *         "第二产业建筑业万元": 6194,
     *         "地区生产总值第三产业万元": 36797,
     *         "交通运输仓储邮政业万元": 8586,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 3,
     *         "年份": 2000,
     *         "地区生产总值万元": 192961,
     *         "地区生产总值第一产业万元": 111962,
     *         "地区生产总值第二产业万元": 34555,
     *         "第二产业工业万元": 28048,
     *         "第二产业建筑业万元": 6508,
     *         "地区生产总值第三产业万元": 46444,
     *         "交通运输仓储邮政业万元": 9822,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 4,
     *         "年份": 2001,
     *         "地区生产总值万元": 215573,
     *         "地区生产总值第一产业万元": 118725,
     *         "地区生产总值第二产业万元": 39954,
     *         "第二产业工业万元": 30616,
     *         "第二产业建筑业万元": 9338,
     *         "地区生产总值第三产业万元": 56894,
     *         "交通运输仓储邮政业万元": 12401,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 5,
     *         "年份": 2002,
     *         "地区生产总值万元": 218427,
     *         "地区生产总值第一产业万元": 119345,
     *         "地区生产总值第二产业万元": 40484,
     *         "第二产业工业万元": 32688,
     *         "第二产业建筑业万元": 7796,
     *         "地区生产总值第三产业万元": 58598,
     *         "交通运输仓储邮政业万元": 13375,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 6,
     *         "年份": 2003,
     *         "地区生产总值万元": 226717,
     *         "地区生产总值第一产业万元": 116819,
     *         "地区生产总值第二产业万元": 43026,
     *         "第二产业工业万元": 33353,
     *         "第二产业建筑业万元": 9673,
     *         "地区生产总值第三产业万元": 66872,
     *         "交通运输仓储邮政业万元": 14879,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 7,
     *         "年份": 2004,
     *         "地区生产总值万元": 285265,
     *         "地区生产总值第一产业万元": 149676,
     *         "地区生产总值第二产业万元": 57274,
     *         "第二产业工业万元": 38494,
     *         "第二产业建筑业万元": 18780,
     *         "地区生产总值第三产业万元": 78315,
     *         "交通运输仓储邮政业万元": 17371,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 8,
     *         "年份": 2005,
     *         "地区生产总值万元": 307838,
     *         "地区生产总值第一产业万元": 155441,
     *         "地区生产总值第二产业万元": 67254,
     *         "第二产业工业万元": 46510,
     *         "第二产业建筑业万元": 20744,
     *         "地区生产总值第三产业万元": 85143,
     *         "交通运输仓储邮政业万元": 14550,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 9,
     *         "年份": 2006,
     *         "地区生产总值万元": 355378,
     *         "地区生产总值第一产业万元": 170924,
     *         "地区生产总值第二产业万元": 83105,
     *         "第二产业工业万元": 56361,
     *         "第二产业建筑业万元": 26744,
     *         "地区生产总值第三产业万元": 101349,
     *         "交通运输仓储邮政业万元": 17554,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 10,
     *         "年份": 2007,
     *         "地区生产总值万元": 456528,
     *         "地区生产总值第一产业万元": 203076,
     *         "地区生产总值第二产业万元": 129937,
     *         "第二产业工业万元": 95988,
     *         "第二产业建筑业万元": 33949,
     *         "地区生产总值第三产业万元": 123515,
     *         "交通运输仓储邮政业万元": 21033,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 11,
     *         "年份": 2008,
     *         "地区生产总值万元": 551139,
     *         "地区生产总值第一产业万元": 230611,
     *         "地区生产总值第二产业万元": 173955,
     *         "第二产业工业万元": 127104,
     *         "第二产业建筑业万元": 46851,
     *         "地区生产总值第三产业万元": 146573,
     *         "交通运输仓储邮政业万元": 23713,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 12,
     *         "年份": 2009,
     *         "地区生产总值万元": 610618,
     *         "地区生产总值第一产业万元": 234930,
     *         "地区生产总值第二产业万元": 203174,
     *         "第二产业工业万元": 148375,
     *         "第二产业建筑业万元": 54799,
     *         "地区生产总值第三产业万元": 172514,
     *         "交通运输仓储邮政业万元": 25122,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 13,
     *         "年份": 2010,
     *         "地区生产总值万元": 759946,
     *         "地区生产总值第一产业万元": 266224,
     *         "地区生产总值第二产业万元": 294243,
     *         "第二产业工业万元": 218114,
     *         "第二产业建筑业万元": 76130,
     *         "地区生产总值第三产业万元": 199479,
     *         "交通运输仓储邮政业万元": 29091,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 14,
     *         "年份": 2011,
     *         "地区生产总值万元": 893205,
     *         "地区生产总值第一产业万元": 312544,
     *         "地区生产总值第二产业万元": 353381,
     *         "第二产业工业万元": 259739,
     *         "第二产业建筑业万元": 93643,
     *         "地区生产总值第三产业万元": 227279,
     *         "交通运输仓储邮政业万元": 35025,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 15,
     *         "年份": 2012,
     *         "地区生产总值万元": 982784,
     *         "地区生产总值第一产业万元": 335829,
     *         "地区生产总值第二产业万元": 391139,
     *         "第二产业工业万元": 279082,
     *         "第二产业建筑业万元": 112057,
     *         "地区生产总值第三产业万元": 255815,
     *         "交通运输仓储邮政业万元": 39859,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 16,
     *         "年份": 2013,
     *         "地区生产总值万元": 1117847,
     *         "地区生产总值第一产业万元": 350020,
     *         "地区生产总值第二产业万元": 438849,
     *         "第二产业工业万元": 295721,
     *         "第二产业建筑业万元": 143127,
     *         "地区生产总值第三产业万元": 328979,
     *         "交通运输仓储邮政业万元": 40546,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 17,
     *         "年份": 2014,
     *         "地区生产总值万元": 1243648,
     *         "地区生产总值第一产业万元": 358487,
     *         "地区生产总值第二产业万元": 511223,
     *         "第二产业工业万元": 327809,
     *         "第二产业建筑业万元": 183414,
     *         "地区生产总值第三产业万元": 373938,
     *         "交通运输仓储邮政业万元": 42411,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 18,
     *         "年份": 2015,
     *         "地区生产总值万元": 1363620,
     *         "地区生产总值第一产业万元": 375627,
     *         "地区生产总值第二产业万元": 559661,
     *         "第二产业工业万元": 347744,
     *         "第二产业建筑业万元": 211917,
     *         "地区生产总值第三产业万元": 428332,
     *         "交通运输仓储邮政业万元": 44107,
     *         "批发零售住宿餐饮业万元": null
     *     },
     *     {
     *         "编号": 19,
     *         "年份": 2016,
     *         "地区生产总值万元": 1504352,
     *         "地区生产总值第一产业万元": 392933,
     *         "地区生产总值第二产业万元": 634914,
     *         "第二产业工业万元": 375928,
     *         "第二产业建筑业万元": 258986,
     *         "地区生产总值第三产业万元": 476505,
     *         "交通运输仓储邮政业万元": 46457,
     *         "批发零售住宿餐饮业万元": null
     *     }
     * ]
     */
@PostMapping(value = "/getDataByTableName")
public Object data(@RequestBody EconomicData economicData) {
    System.out.println(economicData.getTableName());
    return grossProductService.getDataByTableName(economicData);
}
}
