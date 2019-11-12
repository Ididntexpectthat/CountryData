package com.ydl.api.bigDataPlatform.basicspatialdata;

import com.ydl.annotation.UserLoginToken;
import com.ydl.entity.LayerInfoUtil;
import com.ydl.entity.basicspatialdata.ThreeDimensional;
import com.ydl.service.ThreeDimensionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("ThreeDimensional")
public class ThreeDimensionalApi {
    @Autowired
    ThreeDimensionalService threeDimensionalService;
    /**
     * @apiName ThreeDimensional_getThreeDimensional
     * @api {POST} ThreeDimensional/getThreeDimensional 获取3D模型信息
     * @apiGroup 基本空间数据
     * @apiVersion 0.0.2
     * @apiDescription 用于获取3D模型信息
     * @apiParam {JSON} keyvalue 表名字
     * @apiParamExample {json} 请求样例：
     * {
     * 	"keyvalue":"3D-yulinmoxing3"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     *{
     *     "id": 2,
     *     "name": "玉林城区模型",
     *     "url": "http://10.250.0.26:8090/iserver/services/3D-yulinmoxing3/rest/realspace/scenes/yulinmoxing.openrealspace",
     *     "keyvalue": "3D-yulinmoxing3",
     *     "scenename": "yulinmoxing",
     *     "maplayers": "New_Region3D@tiexishuimian|yulin5-8|铁西倾斜模型|城北倾斜模型|201812|江滨合并根节点|二环东面合并根节点|玉东东面|New_Region3D@erhuanshuimian|New_Region3D@江南城北水面|New_Region3D@yudongshuimian",
     *     "layersdatatype": "OSGBLayer",
     *     "updatetime": "2019-11-11T16:00:00.000+0000",
     *     "modifytime": "2019-11-11T16:00:00.000+0000",
     *     "groupname": "玉林市城区",
     *     "centerpointx": 3.7411294E7,
     *     "centerpointy": 2505941.0,
     *     "centerpointz": 0.0,
     *     "remarks": "成果",
     *     "srs": "EPSG:2361"
     * }
     */
    @UserLoginToken
    @PostMapping(value = "/getThreeDimensional")
    public Object getThreeDimensional(@RequestBody ThreeDimensional threeDimensional, HttpServletResponse httpServletResponse) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
//        System.out.println(threeDimensional.getKeyvalue());
//        threeDimensionalService.getThreeDimensional(threeDimensional);
        return new ResponseEntity(threeDimensionalService.getThreeDimensional(threeDimensional), HttpStatus.OK);
    }
}
