package com.ydl.api.bigDataPlatform.economicData;

import com.alibaba.fastjson.JSONObject;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.service.economicData.EconomicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("EconomicData")
public class EconomicDataApi {
    @Autowired
    EconomicDataService economicDataService;
    /**
     * @apiName EconomicData_classification
     * @api {POST} EconomicData/classification 分类
     * @apiGroup 经济数据
     * @apiVersion 0.0.2
     * @apiDescription 用于分类
     * @apiParam {JSON} tableName 分类名字(可选情况分为：农业主要经济指标，农村基本情况，生产总值统计，农民人均纯收入，社会经济基本情况)
     * @apiParam {JSON} [particularYear] 年份
     * @apiParamExample {json} 请求样例：
     *  {
     * 	"tableName":"生产总值",
     * 	"particularYear":"14"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     *   [
     *     {
     *         "tableName": "玉林市历年北流市生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年博白县生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年福绵区生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年陆川县生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年容县生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年兴业县生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年玉州区生产总值统计1998_2014",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年北流市生产总值统计1998_2015",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年博白县生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年北流市生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年福绵区生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年陆川县生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年容县生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年兴业县生产总值统计1998_2016",
     *         "particularYear": null
     *     },
     *     {
     *         "tableName": "玉林市历年玉州区生产总值统计1998_2016",
     *         "particularYear": null
     *     }
     * ]
     */


    @PostMapping("/classification")
    public Object classification(@RequestBody EconomicData economicData) {
        return new ResponseEntity<List>(economicDataService.getAllTableName(economicData), HttpStatus.OK);
    }
    /**
     *  @apiName EconomicData_subRegion
     * @api {POST} EconomicData/subRegion 分地区
     * @apiGroup 经济数据
     * @apiVersion 0.0.2
     * @apiDescription 用于注分地区
     * @apiParam {JSON} tableName 分类名字
     * @apiParam {JSON} [particularYear] 年份
     * @apiParamExample {json} 请求样例：
     *{
     * 	"tableName":"农业主要经济指标"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     *  {
     *     "economicDataList": [
     *         {
     *             "tableName": "玉林市历年北流市农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         },
     *         {
     *             "tableName": "玉林市历年博白县农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         },
     *         {
     *             "tableName": "玉林市历年福绵区农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         },
     *         {
     *             "tableName": "玉林市历年容县农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         },
     *         {
     *             "tableName": "玉林市历年兴业县农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         },
     *         {
     *             "tableName": "玉林市历年玉州区农业主要经济指标统计2006_2014",
     *             "particularYear": null
     *         }
     *     ],
     *     "list": [
     *         "北流市",
     *         "博白县",
     *         "福绵区",
     *         "容县农",
     *         "兴业县",
     *         "玉州区"
     *     ]
     * }
     */
//        @UserLoginToken
    @PostMapping(value = "/subRegion")
    public Object subRegion(@RequestBody EconomicData economicData) {
        JSONObject jsonObject = new JSONObject();
        List<EconomicData> economicDataList = economicDataService.getAllTableName(economicData);
        List list = new ArrayList();

        for(EconomicData economicData1 : economicDataList){
//            System.out.println(economicData1.getTableName().substring(5,8));
            list.add(economicData1.getTableName().substring(5,8));
        }
        jsonObject.put("economicDataList",economicDataList);
        jsonObject.put("list",list);
        return jsonObject;
    }
//    @PostMapping(value = "/subRegion")
//    public Object subRegion(@RequestBody EconomicData economicData) {
//        JSONObject jsonObject = new JSONObject();
//        List<String> list = economicDataService.getAllTableName(economicData);
//        List<String> list1 = new ArrayList();
//
//        for(String economicData1 : list){
////            System.out.println(economicData1.getTableName().substring(5,8));
//            list1.add(economicData1.substring(5,8));
//        }
//        jsonObject.put("tableName",list);
//        jsonObject.put("list",list1);
//        return jsonObject;
//    }
}
