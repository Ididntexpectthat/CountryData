package com.ydl.api.bigDataPlatform.economicData;

import com.ydl.annotation.UserLoginToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.economicData.EconomicData;
import com.ydl.service.economicData.BasicSocialSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("BasicSocialSituation")
public class BasicSocialSituationApi {

    @Autowired
    BasicSocialSituationService basicSocialSituationService;

    /**@apiName BasicSocialSituation_getDataByTableName
     * @api {POST} BasicSocialSituation/getDataByTableName 社会经济基本情况
     * @apiGroup 经济数据
     * @apiVersion 0.0.2
     * @apiDescription 用于获取社会经济基本情况统计的数据
     * @apiParam {JSON} tableName 表代称（可选分为：BasicSocialSituation1_2014，BasicSocialSituation2_2014，BasicSocialSituation1_2015，BasicSocialSituation2_2015，BasicSocialSituation1_2016，BasicSocialSituation2_2016）
     * @apiParamExample {json} 请求样例：
     *{
     * 	"tableName":"BasicSocialSituation1_2016"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiError(401){List} msg 参数错误，请输入正确的数据！
     * @apiSuccessExample {json} 返回样例:
     *[
     *     {
     *         "编号": 1,
     *         "县市区": "玉林市",
     *         "年末总人口人": 7173248,
     *         "年末总户数户": 2067705,
     *         "常住人口万人": 575.6,
     *         "常住人口城镇人口万人": 272.07,
     *         "城镇化率": 47.27,
     *         "地区生产总值万元": 15538299,
     *         "地区生产总值第一产业增加值万元": 2781583,
     *         "地区生产总值第二产业增加值万元": 6650320,
     *         "地区生产总值工业万元": 5211100,
     *         "地区生产总值第三产业增加值万元": 6106396,
     *         "人均地区生产总值元": 27110,
     *         "地区生产总值指数": 108.0,
     *         "地区生产总值指数第一产业": 102.1,
     *         "地区生产总值指数第二产业": 109.6,
     *         "地区生产总值指数工业": 108.2,
     *         "地区生产总值指数第三产业": 109.0,
     *         "人均地区生产总值指数": 107.1,
     *         "财政收入万元": 1502811,
     *         "财政收入公共财政预算收入万元": 1048077,
     *         "公共财政预算支出万元": 3180858,
     *         "年末金融机构各项存款余额亿元": 1636.12,
     *         "住户存款余额亿元": 1253.03,
     *         "年末金融机构各项贷款余额亿元": 1014.94,
     *         "农林牧渔业总产值万元": 4835799,
     *         "农林牧渔业总产值指数": 102.72,
     *         "农业机械总动力千瓦": 3666025,
     *         "农用化肥施用实物量吨": 623109,
     *         "农药使用量吨": 6941,
     *         "农作物总播种面积公顷": 495079,
     *         "粮食作物播种面积公顷": 314848,
     *         "粮食作物播种面积稻谷公顷": 255914,
     *         "粮食作物播种面积玉米公顷": 21961,
     *         "蔬菜播种面积公顷": 110056,
     *         "粮食总产量吨": 1849060,
     *         "粮食总产量稻谷吨": 1624432,
     *         "粮食总产量玉米吨": 114878
     *     },
     *     {
     *         "编号": 2,
     *         "县市区": "玉州区",
     *         "年末总人口人": 669234,
     *         "年末总户数户": 187197,
     *         "常住人口万人": 72.07,
     *         "常住人口城镇人口万人": 55.76,
     *         "城镇化率": 77.37,
     *         "地区生产总值万元": 3658102,
     *         "地区生产总值第一产业增加值万元": 175422,
     *         "地区生产总值第二产业增加值万元": 1363307,
     *         "地区生产总值工业万元": 1014715,
     *         "地区生产总值第三产业增加值万元": 2119373,
     *         "人均地区生产总值元": 51080,
     *         "地区生产总值指数": 109.5,
     *         "地区生产总值指数第一产业": 101.1,
     *         "地区生产总值指数第二产业": 110.4,
     *         "地区生产总值指数工业": 108.5,
     *         "地区生产总值指数第三产业": 109.5,
     *         "人均地区生产总值指数": 108.2,
     *         "财政收入万元": 204499,
     *         "财政收入公共财政预算收入万元": 155527,
     *         "公共财政预算支出万元": 277780,
     *         "年末金融机构各项存款余额亿元": 622.84,
     *         "住户存款余额亿元": 378.28,
     *         "年末金融机构各项贷款余额亿元": 424.0,
     *         "农林牧渔业总产值万元": 290027,
     *         "农林牧渔业总产值指数": 101.47,
     *         "农业机械总动力千瓦": 259936,
     *         "农用化肥施用实物量吨": 28630,
     *         "农药使用量吨": 333,
     *         "农作物总播种面积公顷": 31272,
     *         "粮食作物播种面积公顷": 18514,
     *         "粮食作物播种面积稻谷公顷": 16773,
     *         "粮食作物播种面积玉米公顷": 211,
     *         "蔬菜播种面积公顷": 10406,
     *         "粮食总产量吨": 110063,
     *         "粮食总产量稻谷吨": 104192,
     *         "粮食总产量玉米吨": 1022
     *     },
     *     {
     *         "编号": 3,
     *         "县市区": "福绵区",
     *         "年末总人口人": 434954,
     *         "年末总户数户": 118233,
     *         "常住人口万人": 39.71,
     *         "常住人口城镇人口万人": 15.11,
     *         "城镇化率": 38.05,
     *         "地区生产总值万元": 731307,
     *         "地区生产总值第一产业增加值万元": 237880,
     *         "地区生产总值第二产业增加值万元": 268805,
     *         "地区生产总值工业万元": 150338,
     *         "地区生产总值第三产业增加值万元": 224622,
     *         "人均地区生产总值元": 18477,
     *         "地区生产总值指数": 109.1,
     *         "地区生产总值指数第一产业": 103.2,
     *         "地区生产总值指数第二产业": 115.4,
     *         "地区生产总值指数工业": 111.2,
     *         "地区生产总值指数第三产业": 108.6,
     *         "人均地区生产总值指数": 108.5,
     *         "财政收入万元": 46573,
     *         "财政收入公共财政预算收入万元": 37988,
     *         "公共财政预算支出万元": 147540,
     *         "年末金融机构各项存款余额亿元": 0.0,
     *         "住户存款余额亿元": 0.0,
     *         "年末金融机构各项贷款余额亿元": 0.0,
     *         "农林牧渔业总产值万元": 413265,
     *         "农林牧渔业总产值指数": 103.73,
     *         "农业机械总动力千瓦": 334118,
     *         "农用化肥施用实物量吨": 60402,
     *         "农药使用量吨": 813,
     *         "农作物总播种面积公顷": 45760,
     *         "粮食作物播种面积公顷": 27634,
     *         "粮食作物播种面积稻谷公顷": 24931,
     *         "粮食作物播种面积玉米公顷": 620,
     *         "蔬菜播种面积公顷": 11684,
     *         "粮食总产量吨": 164107,
     *         "粮食总产量稻谷吨": 153049,
     *         "粮食总产量玉米吨": 3280
     *     },
     *     {
     *         "编号": 4,
     *         "县市区": "容县",
     *         "年末总人口人": 860190,
     *         "年末总户数户": 288505,
     *         "常住人口万人": 66.41,
     *         "常住人口城镇人口万人": 27.29,
     *         "城镇化率": 41.09,
     *         "地区生产总值万元": 1912066,
     *         "地区生产总值第一产业增加值万元": 366080,
     *         "地区生产总值第二产业增加值万元": 982315,
     *         "地区生产总值工业万元": 885941,
     *         "地区生产总值第三产业增加值万元": 563671,
     *         "人均地区生产总值元": 28892,
     *         "地区生产总值指数": 109.2,
     *         "地区生产总值指数第一产业": 103.2,
     *         "地区生产总值指数第二产业": 111.1,
     *         "地区生产总值指数工业": 111.1,
     *         "地区生产总值指数第三产业": 109.8,
     *         "人均地区生产总值指数": 108.4,
     *         "财政收入万元": 133100,
     *         "财政收入公共财政预算收入万元": 97858,
     *         "公共财政预算支出万元": 362447,
     *         "年末金融机构各项存款余额亿元": 204.48,
     *         "住户存款余额亿元": 176.04,
     *         "年末金融机构各项贷款余额亿元": 109.77,
     *         "农林牧渔业总产值万元": 655664,
     *         "农林牧渔业总产值指数": 103.72,
     *         "农业机械总动力千瓦": 621849,
     *         "农用化肥施用实物量吨": 89563,
     *         "农药使用量吨": 870,
     *         "农作物总播种面积公顷": 58505,
     *         "粮食作物播种面积公顷": 38430,
     *         "粮食作物播种面积稻谷公顷": 32890,
     *         "粮食作物播种面积玉米公顷": 1550,
     *         "蔬菜播种面积公顷": 14878,
     *         "粮食总产量吨": 228504,
     *         "粮食总产量稻谷吨": 208715,
     *         "粮食总产量玉米吨": 7587
     *     },
     *     {
     *         "编号": 5,
     *         "县市区": "陆川县",
     *         "年末总人口人": 1093863,
     *         "年末总户数户": 331023,
     *         "常住人口万人": 79.54,
     *         "常住人口城镇人口万人": 33.92,
     *         "城镇化率": 42.65,
     *         "地区生产总值万元": 2340380,
     *         "地区生产总值第一产业增加值万元": 341527,
     *         "地区生产总值第二产业增加值万元": 1117964,
     *         "地区生产总值工业万元": 965198,
     *         "地区生产总值第三产业增加值万元": 880889,
     *         "人均地区生产总值元": 29542,
     *         "地区生产总值指数": 106.6,
     *         "地区生产总值指数第一产业": 102.5,
     *         "地区生产总值指数第二产业": 106.7,
     *         "地区生产总值指数工业": 106.6,
     *         "地区生产总值指数第三产业": 107.9,
     *         "人均地区生产总值指数": 105.7,
     *         "财政收入万元": 144065,
     *         "财政收入公共财政预算收入万元": 112137,
     *         "公共财政预算支出万元": 475571,
     *         "年末金融机构各项存款余额亿元": 165.13,
     *         "住户存款余额亿元": 142.1,
     *         "年末金融机构各项贷款余额亿元": 90.66,
     *         "农林牧渔业总产值万元": 592075,
     *         "农林牧渔业总产值指数": 102.74,
     *         "农业机械总动力千瓦": 561859,
     *         "农用化肥施用实物量吨": 61740,
     *         "农药使用量吨": 889,
     *         "农作物总播种面积公顷": 61150,
     *         "粮食作物播种面积公顷": 43910,
     *         "粮食作物播种面积稻谷公顷": 37340,
     *         "粮食作物播种面积玉米公顷": 2320,
     *         "蔬菜播种面积公顷": 9488,
     *         "粮食总产量吨": 268263,
     *         "粮食总产量稻谷吨": 246365,
     *         "粮食总产量玉米吨": 11456
     *     },
     *     {
     *         "编号": 6,
     *         "县市区": "博白县",
     *         "年末总人口人": 1859817,
     *         "年末总户数户": 516027,
     *         "常住人口万人": 140.26,
     *         "常住人口城镇人口万人": 52.9,
     *         "城镇化率": 37.72,
     *         "地区生产总值万元": 2458486,
     *         "地区生产总值第一产业增加值万元": 801873,
     *         "地区生产总值第二产业增加值万元": 842485,
     *         "地区生产总值工业万元": 668492,
     *         "地区生产总值第三产业增加值万元": 814128,
     *         "人均地区生产总值元": 17597,
     *         "地区生产总值指数": 106.0,
     *         "地区生产总值指数第一产业": 101.9,
     *         "地区生产总值指数第二产业": 105.6,
     *         "地区生产总值指数工业": 105.3,
     *         "地区生产总值指数第三产业": 110.6,
     *         "人均地区生产总值指数": 105.1,
     *         "财政收入万元": 156443,
     *         "财政收入公共财政预算收入万元": 121314,
     *         "公共财政预算支出万元": 594868,
     *         "年末金融机构各项存款余额亿元": 247.59,
     *         "住户存款余额亿元": 214.94,
     *         "年末金融机构各项贷款余额亿元": 143.4,
     *         "农林牧渔业总产值万元": 1348016,
     *         "农林牧渔业总产值指数": 102.6,
     *         "农业机械总动力千瓦": 739332,
     *         "农用化肥施用实物量吨": 173222,
     *         "农药使用量吨": 1336,
     *         "农作物总播种面积公顷": 143304,
     *         "粮食作物播种面积公顷": 86040,
     *         "粮食作物播种面积稻谷公顷": 59770,
     *         "粮食作物播种面积玉米公顷": 12750,
     *         "蔬菜播种面积公顷": 31744,
     *         "粮食总产量吨": 484529,
     *         "粮食总产量稻谷吨": 375017,
     *         "粮食总产量玉米吨": 69486
     *     },
     *     {
     *         "编号": 7,
     *         "县市区": "兴业县",
     *         "年末总人口人": 759748,
     *         "年末总户数户": 216141,
     *         "常住人口万人": 58.43,
     *         "常住人口城镇人口万人": 21.83,
     *         "城镇化率": 37.36,
     *         "地区生产总值万元": 1504352,
     *         "地区生产总值第一产业增加值万元": 392933,
     *         "地区生产总值第二产业增加值万元": 634914,
     *         "地区生产总值工业万元": 375928,
     *         "地区生产总值第三产业增加值万元": 476505,
     *         "人均地区生产总值元": 25815,
     *         "地区生产总值指数": 110.5,
     *         "地区生产总值指数第一产业": 100.7,
     *         "地区生产总值指数第二产业": 117.5,
     *         "地区生产总值指数工业": 114.0,
     *         "地区生产总值指数第三产业": 110.0,
     *         "人均地区生产总值指数": 109.7,
     *         "财政收入万元": 109647,
     *         "财政收入公共财政预算收入万元": 83193,
     *         "公共财政预算支出万元": 290344,
     *         "年末金融机构各项存款余额亿元": 120.71,
     *         "住户存款余额亿元": 104.81,
     *         "年末金融机构各项贷款余额亿元": 69.06,
     *         "农林牧渔业总产值万元": 741073,
     *         "农林牧渔业总产值指数": 101.98,
     *         "农业机械总动力千瓦": 475372,
     *         "农用化肥施用实物量吨": 66222,
     *         "农药使用量吨": 930,
     *         "农作物总播种面积公顷": 64316,
     *         "粮食作物播种面积公顷": 41280,
     *         "粮食作物播种面积稻谷公顷": 35540,
     *         "粮食作物播种面积玉米公顷": 2700,
     *         "蔬菜播种面积公顷": 12917,
     *         "粮食总产量吨": 250458,
     *         "粮食总产量稻谷吨": 227437,
     *         "粮食总产量玉米吨": 12463
     *     },
     *     {
     *         "编号": 8,
     *         "县市区": "北流市",
     *         "年末总人口人": 1495442,
     *         "年末总户数户": 410579,
     *         "常住人口万人": 119.18,
     *         "常住人口城镇人口万人": 65.26,
     *         "城镇化率": 54.76,
     *         "地区生产总值万元": 2985937,
     *         "地区生产总值第一产业增加值万元": 465868,
     *         "地区生产总值第二产业增加值万元": 1434376,
     *         "地区生产总值工业万元": 1143536,
     *         "地区生产总值第三产业增加值万元": 1085693,
     *         "人均地区生产总值元": 25181,
     *         "地区生产总值指数": 107.7,
     *         "地区生产总值指数第一产业": 102.1,
     *         "地区生产总值指数第二产业": 108.4,
     *         "地区生产总值指数工业": 107.0,
     *         "地区生产总值指数第三产业": 109.2,
     *         "人均地区生产总值指数": 106.8,
     *         "财政收入万元": 227977,
     *         "财政收入公共财政预算收入万元": 157035,
     *         "公共财政预算支出万元": 477861,
     *         "年末金融机构各项存款余额亿元": 275.36,
     *         "住户存款余额亿元": 236.85,
     *         "年末金融机构各项贷款余额亿元": 178.06,
     *         "农林牧渔业总产值万元": 795679,
     *         "农林牧渔业总产值指数": 102.63,
     *         "农业机械总动力千瓦": 673559,
     *         "农用化肥施用实物量吨": 143330,
     *         "农药使用量吨": 1770,
     *         "农作物总播种面积公顷": 90772,
     *         "粮食作物播种面积公顷": 59040,
     *         "粮食作物播种面积稻谷公顷": 48670,
     *         "粮食作物播种面积玉米公顷": 1810,
     *         "蔬菜播种面积公顷": 18939,
     *         "粮食总产量吨": 343136,
     *         "粮食总产量稻谷吨": 309657,
     *         "粮食总产量玉米吨": 9584
     *     },
     *     {
     *         "编号": 9,
     *         "县市区": "玉东新区",
     *         "年末总人口人": 0,
     *         "年末总户数户": 0,
     *         "常住人口万人": 0.0,
     *         "常住人口城镇人口万人": 0.0,
     *         "城镇化率": 0.0,
     *         "地区生产总值万元": 0,
     *         "地区生产总值第一产业增加值万元": 0,
     *         "地区生产总值第二产业增加值万元": 0,
     *         "地区生产总值工业万元": 0,
     *         "地区生产总值第三产业增加值万元": 0,
     *         "人均地区生产总值元": 0,
     *         "地区生产总值指数": 0.0,
     *         "地区生产总值指数第一产业": 0.0,
     *         "地区生产总值指数第二产业": 0.0,
     *         "地区生产总值指数工业": 0.0,
     *         "地区生产总值指数第三产业": 0.0,
     *         "人均地区生产总值指数": 126859.0,
     *         "财政收入万元": 82844,
     *         "财政收入公共财政预算收入万元": 92154,
     *         "公共财政预算支出万元": 0,
     *         "年末金融机构各项存款余额亿元": 0.0,
     *         "住户存款余额亿元": 0.0,
     *         "年末金融机构各项贷款余额亿元": 0.0,
     *         "农林牧渔业总产值万元": 0,
     *         "农林牧渔业总产值指数": 0.0,
     *         "农业机械总动力千瓦": 0,
     *         "农用化肥施用实物量吨": 0,
     *         "农药使用量吨": 0,
     *         "农作物总播种面积公顷": 0,
     *         "粮食作物播种面积公顷": 0,
     *         "粮食作物播种面积稻谷公顷": 0,
     *         "粮食作物播种面积玉米公顷": 0,
     *         "蔬菜播种面积公顷": 0,
     *         "粮食总产量吨": 0,
     *         "粮食总产量稻谷吨": 0,
     *         "粮食总产量玉米吨": 0
     *     }
     * ]

     * @apiErrorExample {List} 失败返回样例
     * [
     *     "数据错误，请输入正确的数据！"
     * ]
     */
    @UserLoginToken
    @PostMapping("getDataByTableName")
    public Object getAllByTableName(@RequestBody Map<String, Object> models) throws Exception {
        EconomicData economicData = JsonXMLUtils.map2obj((Map<String, Object>) models.get("economicdata"), EconomicData.class);
        return basicSocialSituationService.getDataByTableName(economicData);
    }
}
