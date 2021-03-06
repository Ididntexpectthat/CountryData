package com.ydl.api.bigDataPlatform.economicData;

import com.ydl.annotation.UserLoginToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.service.economicData.RuralPerCapitaNetIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("RuralPerCapitaNetIncome")
//农民人均纯收入
public class RuralPerCapitaNetIncomeApi {
    @Autowired
    RuralPerCapitaNetIncomeService rural;

    /**
     * @apiName RuralPerCapitaNetIncome_getDataByTableName
     * @api {POST} RuralPerCapitaNetIncome/getDataByTableName 农民人均纯收入
     * @apiGroup 经济数据
     * @apiVersion 0.0.2
     * @apiDescription 用于获取农民人均纯收入的数据
     * @apiParam {JSON} tableName 分类名字
     * @apiParamExample {json} 请求样例：
     * {
     * "tableName":"玉林市历年各县市区农民人均纯收入统计2000_2016"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     * [
     * {
     * "编号": 1,
     * "年份": 2000,
     * "玉林市": 1736,
     * "玉州区": 1896,
     * "福棉区": 1810,
     * "容县": 1611,
     * "陆川县": 1667,
     * "博白县": 1604,
     * "兴业县": 1644,
     * "北流市": 2014,
     * "玉东新区": null
     * },
     * {
     * "编号": 2,
     * "年份": 2001,
     * "玉林市": 1839,
     * "玉州区": 1984,
     * "福棉区": 1919,
     * "容县": 1703,
     * "陆川县": 1773,
     * "博白县": 1719,
     * "兴业县": 1704,
     * "北流市": 2139,
     * "玉东新区": null
     * },
     * {
     * "编号": 3,
     * "年份": 2002,
     * "玉林市": 1959,
     * "玉州区": 2088,
     * "福棉区": 2022,
     * "容县": 1801,
     * "陆川县": 1872,
     * "博白县": 1860,
     * "兴业县": 1806,
     * "北流市": 2281,
     * "玉东新区": null
     * },
     * {
     * "编号": 4,
     * "年份": 2003,
     * "玉林市": 2035,
     * "玉州区": 2149,
     * "福棉区": 2047,
     * "容县": 1895,
     * "陆川县": 1976,
     * "博白县": 1933,
     * "兴业县": 1948,
     * "北流市": 2308,
     * "玉东新区": null
     * },
     * {
     * "编号": 5,
     * "年份": 2004,
     * "玉林市": 2259,
     * "玉州区": 2460,
     * "福棉区": 2230,
     * "容县": 2192,
     * "陆川县": 2235,
     * "博白县": 2062,
     * "兴业县": 2200,
     * "北流市": 2551,
     * "玉东新区": null
     * },
     * {
     * "编号": 6,
     * "年份": 2005,
     * "玉林市": 2573,
     * "玉州区": 2883,
     * "福棉区": 2519,
     * "容县": 2541,
     * "陆川县": 2526,
     * "博白县": 2367,
     * "兴业县": 2444,
     * "北流市": 2884,
     * "玉东新区": null
     * },
     * {
     * "编号": 7,
     * "年份": 2006,
     * "玉林市": 3041,
     * "玉州区": 3573,
     * "福棉区": 2988,
     * "容县": 2998,
     * "陆川县": 2989,
     * "博白县": 2797,
     * "兴业县": 2807,
     * "北流市": 3414,
     * "玉东新区": null
     * },
     * {
     * "编号": 8,
     * "年份": 2007,
     * "玉林市": 3536,
     * "玉州区": 4173,
     * "福棉区": 3452,
     * "容县": 3469,
     * "陆川县": 3484,
     * "博白县": 3252,
     * "兴业县": 3251,
     * "北流市": 3964,
     * "玉东新区": null
     * },
     * {
     * "编号": 9,
     * "年份": 2008,
     * "玉林市": 4123,
     * "玉州区": 4970,
     * "福棉区": 4148,
     * "容县": 4066,
     * "陆川县": 4086,
     * "博白县": 3814,
     * "兴业县": 3806,
     * "北流市": 4500,
     * "玉东新区": null
     * },
     * {
     * "编号": 10,
     * "年份": 2009,
     * "玉林市": 4531,
     * "玉州区": 5396,
     * "福棉区": 4536,
     * "容县": 4470,
     * "陆川县": 4525,
     * "博白县": 4215,
     * "兴业县": 4143,
     * "北流市": 4917,
     * "玉东新区": null
     * },
     * {
     * "编号": 11,
     * "年份": 2010,
     * "玉林市": 5302,
     * "玉州区": 6229,
     * "福棉区": 5233,
     * "容县": 5186,
     * "陆川县": 5274,
     * "博白县": 5084,
     * "兴业县": 4783,
     * "北流市": 5686,
     * "玉东新区": null
     * },
     * {
     * "编号": 12,
     * "年份": 2011,
     * "玉林市": 6269,
     * "玉州区": 7226,
     * "福棉区": 6071,
     * "容县": 6043,
     * "陆川县": 6228,
     * "博白县": 6150,
     * "兴业县": 5592,
     * "北流市": 6726,
     * "玉东新区": null
     * },
     * {
     * "编号": 13,
     * "年份": 2012,
     * "玉林市": 7269,
     * "玉州区": 8371,
     * "福棉区": 7055,
     * "容县": 7012,
     * "陆川县": 7207,
     * "博白县": 7127,
     * "兴业县": 6483,
     * "北流市": 7795,
     * "玉东新区": null
     * },
     * {
     * "编号": 14,
     * "年份": 2013,
     * "玉林市": 8272,
     * "玉州区": 9518,
     * "福棉区": 8057,
     * "容县": 7994,
     * "陆川县": 8180,
     * "博白县": 8118,
     * "兴业县": 7384,
     * "北流市": 8871,
     * "玉东新区": null
     * },
     * {
     * "编号": 15,
     * "年份": 2014,
     * "玉林市": 9314,
     * "玉州区": 10736,
     * "福棉区": 9040,
     * "容县": 9033,
     * "陆川县": 9153,
     * "博白县": 9133,
     * "兴业县": 8270,
     * "北流市": 10042,
     * "玉东新区": null
     * },
     * {
     * "编号": 16,
     * "年份": 2015,
     * "玉林市": 10292,
     * "玉州区": 11810,
     * "福棉区": 10016,
     * "容县": 9918,
     * "陆川县": 10087,
     * "博白县": 10092,
     * "兴业县": 9130,
     * "北流市": 11106,
     * "玉东新区": null
     * },
     * {
     * "编号": 17,
     * "年份": 2016,
     * "玉林市": 12590,
     * "玉州区": 14274,
     * "福棉区": 12274,
     * "容县": 11940,
     * "陆川县": 11980,
     * "博白县": 11984,
     * "兴业县": 11167,
     * "北流市": 13461,
     * "玉东新区": null
     * }
     * ]
     */
    @UserLoginToken
    @PostMapping(value = "/getDataByTableName")
    public Object data(@RequestBody Map<String, Object> models) throws Exception {
        EconomicData economicData = JsonXMLUtils.map2obj((Map<String, Object>) models.get("economicdata"), EconomicData.class);
        return rural.getDataByTableName(economicData);
    }
}
