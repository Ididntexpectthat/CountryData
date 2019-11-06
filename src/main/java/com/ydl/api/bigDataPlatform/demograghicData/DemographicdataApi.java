package com.ydl.api.bigDataPlatform.demograghicData;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ydl.entity.demographicData.DemographicData;
import com.ydl.service.demograhicData.DemographicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("Demographicdata")
public class DemographicdataApi {
    @Autowired
    DemographicDataService demographicDataService;
//    @Autowired
//    DemographicDataMapper demographicDataMapper;
    /**
     * @apiName Demographicdata_getAll
     * @api {POST} Demographicdata/getAll 选地区获取人口数据
     * @apiGroup 人口数据
     * @apiVersion 0.0.2
     * @apiDescription 用于选择地区获取相关地区的人口数据
     * @apiParam {JSON} cityName 城市名字
     * @apiParam {JSON} [districtName]  区县名字
     * @apiParam {JSON} [townName] 乡镇名字
     * @apiParam {JSON} [administrativeVillage] 行政村名字
     * @apiParamExample {json} 请求样例：
     *{
     * 	"cityName":"玉林市",
     * 	"districtName":"玉州区",
     * 	"townName":"城西街道办事处",
     * 	"administrativeVillage":"江岸社区居委会"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     * [
     *     {
     *         "女性人口总数": 2794,
     *         "总户数": 1571,
     *         "集体户男性人口总数": 33,
     *         "家庭户男性人口总数": 2740,
     *         "家庭户女性人口总数": 2748,
     *         "平均家庭户规模_人每户": 3.566,
     *         "区县名": "玉州区",
     *         "集体户人口数": 79,
     *         "城市名": "玉林市",
     *         "集体户男女比例": 71.74,
     *         "编号": 30,
     *         "人口总数": 5567,
     *         "男性人口总数": 2773,
     *         "家庭户数": 1539,
     *         "行政村": "江岸社区居委会",
     *         "男女比例": 99.25,
     *         "家庭户人口数": 5488,
     *         "集体户女性人口总数": 46,
     *         "家庭户男女比例": 99.71,
     *         "集体户数": 32,
     *         "乡镇名": "城西街道办事处"
     *     }
     * ]
     */
//    @UserLoginToken
    @PostMapping("/getAll")
    public Object getAllDemograhicData(@RequestBody DemographicData demographicData) {
//            return new ResponseEntity(demographicDataMapper.selectByPrimaryKey(demographicData.get编号()),HttpStatus.OK);
        return new ResponseEntity<List>(demographicDataService.getAllSelective(demographicData), HttpStatus.OK);
    }

    /**
     * @apiName Demographicdata_getAllPaging
     * @api {POST} Demographicdata/getAllPaging 分页获取所有人口数据
     * @apiGroup 人口数据
     * @apiVersion 0.0.2
     * @apiDescription 用于选择地区获取相关地区的人口数据
     * @apiHeader {String} pagenum 当前页数
     * @apiHeaderExample {String} 请求样例：
     *pagenum ： 6
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     *[
     *     {
     *         "编号": 51,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "城北街道办事处",
     *         "行政村": "谷山村委会",
     *         "总户数": 1043,
     *         "家庭户数": 1036,
     *         "集体户数": 7,
     *         "人口总数": 5106,
     *         "男性人口总数": 2598,
     *         "女性人口总数": 2508,
     *         "男女比例": 103.59,
     *         "家庭户人口数": 4835,
     *         "家庭户男性人口总数": 2430,
     *         "家庭户女性人口总数": 2405,
     *         "家庭户男女比例": 101.04,
     *         "集体户人口数": 271,
     *         "集体户男性人口总数": 168,
     *         "集体户女性人口总数": 103,
     *         "集体户男女比例": 163.11,
     *         "平均家庭户规模人每户": 4.667
     *     },
     *     {
     *         "编号": 52,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "五里桥社区居委会",
     *         "总户数": 2329,
     *         "家庭户数": 2234,
     *         "集体户数": 95,
     *         "人口总数": 6926,
     *         "男性人口总数": 3617,
     *         "女性人口总数": 3309,
     *         "男女比例": 109.31,
     *         "家庭户人口数": 6356,
     *         "家庭户男性人口总数": 3304,
     *         "家庭户女性人口总数": 3052,
     *         "家庭户男女比例": 108.26,
     *         "集体户人口数": 570,
     *         "集体户男性人口总数": 313,
     *         "集体户女性人口总数": 257,
     *         "集体户男女比例": 121.79,
     *         "平均家庭户规模人每户": 2.8451
     *     },
     *     {
     *         "编号": 53,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "名山社区居委会",
     *         "总户数": 5047,
     *         "家庭户数": 4715,
     *         "集体户数": 332,
     *         "人口总数": 18967,
     *         "男性人口总数": 9194,
     *         "女性人口总数": 9773,
     *         "男女比例": 94.08,
     *         "家庭户人口数": 15733,
     *         "家庭户男性人口总数": 7805,
     *         "家庭户女性人口总数": 7928,
     *         "家庭户男女比例": 98.45,
     *         "集体户人口数": 3234,
     *         "集体户男性人口总数": 1389,
     *         "集体户女性人口总数": 1845,
     *         "集体户男女比例": 75.28,
     *         "平均家庭户规模人每户": 3.3368
     *     },
     *     {
     *         "编号": 54,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "旺瑶社区居委会",
     *         "总户数": 1957,
     *         "家庭户数": 1876,
     *         "集体户数": 81,
     *         "人口总数": 7787,
     *         "男性人口总数": 3860,
     *         "女性人口总数": 3927,
     *         "男女比例": 98.29,
     *         "家庭户人口数": 6967,
     *         "家庭户男性人口总数": 3524,
     *         "家庭户女性人口总数": 3443,
     *         "家庭户男女比例": 102.35,
     *         "集体户人口数": 820,
     *         "集体户男性人口总数": 336,
     *         "集体户女性人口总数": 484,
     *         "集体户男女比例": 69.42,
     *         "平均家庭户规模人每户": 3.7138
     *     },
     *     {
     *         "编号": 55,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "绿杨社区居委会",
     *         "总户数": 1113,
     *         "家庭户数": 1103,
     *         "集体户数": 10,
     *         "人口总数": 3821,
     *         "男性人口总数": 1965,
     *         "女性人口总数": 1856,
     *         "男女比例": 105.87,
     *         "家庭户人口数": 3545,
     *         "家庭户男性人口总数": 1792,
     *         "家庭户女性人口总数": 1753,
     *         "家庭户男女比例": 102.22,
     *         "集体户人口数": 276,
     *         "集体户男性人口总数": 173,
     *         "集体户女性人口总数": 103,
     *         "集体户男女比例": 167.96,
     *         "平均家庭户规模人每户": 3.214
     *     },
     *     {
     *         "编号": 56,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "太阳村委会",
     *         "总户数": 963,
     *         "家庭户数": 963,
     *         "集体户数": null,
     *         "人口总数": 3794,
     *         "男性人口总数": 1978,
     *         "女性人口总数": 1816,
     *         "男女比例": 108.92,
     *         "家庭户人口数": 3794,
     *         "家庭户男性人口总数": 1978,
     *         "家庭户女性人口总数": 1816,
     *         "家庭户男女比例": 108.92,
     *         "集体户人口数": null,
     *         "集体户男性人口总数": null,
     *         "集体户女性人口总数": null,
     *         "集体户男女比例": null,
     *         "平均家庭户规模人每户": 3.9398
     *     },
     *     {
     *         "编号": 57,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "腾扬村委会",
     *         "总户数": 1251,
     *         "家庭户数": 1251,
     *         "集体户数": null,
     *         "人口总数": 5621,
     *         "男性人口总数": 2909,
     *         "女性人口总数": 2712,
     *         "男女比例": 107.26,
     *         "家庭户人口数": 5621,
     *         "家庭户男性人口总数": 2909,
     *         "家庭户女性人口总数": 2712,
     *         "家庭户男女比例": 107.26,
     *         "集体户人口数": null,
     *         "集体户男性人口总数": null,
     *         "集体户女性人口总数": null,
     *         "集体户男女比例": null,
     *         "平均家庭户规模人每户": 4.4932
     *     },
     *     {
     *         "编号": 58,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "朱砂村委会",
     *         "总户数": 1002,
     *         "家庭户数": 1002,
     *         "集体户数": null,
     *         "人口总数": 4228,
     *         "男性人口总数": 2239,
     *         "女性人口总数": 1989,
     *         "男女比例": 112.57,
     *         "家庭户人口数": 4228,
     *         "家庭户男性人口总数": 2239,
     *         "家庭户女性人口总数": 1989,
     *         "家庭户男女比例": 112.57,
     *         "集体户人口数": null,
     *         "集体户男性人口总数": null,
     *         "集体户女性人口总数": null,
     *         "集体户男女比例": null,
     *         "平均家庭户规模人每户": 4.2196
     *     },
     *     {
     *         "编号": 59,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "名山街道办事处",
     *         "行政村": "二泉村委会",
     *         "总户数": 661,
     *         "家庭户数": 661,
     *         "集体户数": null,
     *         "人口总数": 2841,
     *         "男性人口总数": 1453,
     *         "女性人口总数": 1388,
     *         "男女比例": 104.68,
     *         "家庭户人口数": 2841,
     *         "家庭户男性人口总数": 1453,
     *         "家庭户女性人口总数": 1388,
     *         "家庭户男女比例": 104.68,
     *         "集体户人口数": null,
     *         "集体户男性人口总数": null,
     *         "集体户女性人口总数": null,
     *         "集体户男女比例": null,
     *         "平均家庭户规模人每户": 4.298
     *     },
     *     {
     *         "编号": 60,
     *         "城市名": "玉林市",
     *         "区县名": "玉州区",
     *         "乡镇名": "大塘镇",
     *         "行政村": "大塘村委会",
     *         "总户数": 1772,
     *         "家庭户数": 1766,
     *         "集体户数": 6,
     *         "人口总数": 7318,
     *         "男性人口总数": 3946,
     *         "女性人口总数": 3372,
     *         "男女比例": 117.02,
     *         "家庭户人口数": 7235,
     *         "家庭户男性人口总数": 3887,
     *         "家庭户女性人口总数": 3348,
     *         "家庭户男女比例": 116.1,
     *         "集体户人口数": 83,
     *         "集体户男性人口总数": 59,
     *         "集体户女性人口总数": 24,
     *         "集体户男女比例": 245.83,
     *         "平均家庭户规模人每户": 4.0968
     *     }
     * ]
     */
//    @UserLoginToken
    @PostMapping("/getAllPaging")
    public Object getAllDemograhicDataPaging(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//            return new ResponseEntity(demographicDataMapper.selectByPrimaryKey(demographicData.get编号()),HttpStatus.OK);
        String pagenum = httpServletRequest.getHeader("pagenum");
        if (StringUtils.isEmpty(pagenum)) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "页码不能为空！!");
            return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
        }
        Page page = PageHelper.startPage(Integer.parseInt(pagenum), 10);
        List<DemographicData> list = demographicDataService.getAllDemograhicData();
//        PageInfo<DemographicData> info = new PageInfo<>(list);
        PageInfo info = new PageInfo<>(page.getResult());
//        System.out.println(info);
        String pageCount = info.getPages()  + "";
        httpServletResponse.setHeader("pageCount", pageCount);
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
