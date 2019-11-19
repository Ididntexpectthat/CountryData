package com.ydl.api;

import com.ydl.annotation.UserLoginToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.Function;
import com.ydl.entity.LayerInfo;
import com.ydl.entity.LayerInfoUtil;
import com.ydl.service.LayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("LayerInfo")
public class LayerInfoApi {

    @Autowired
    LayerInfoService layerInfoService;
    /**
     * @apiName LayerInfo_getLayerInfo
     * @api {POST} LayerInfo/getLayerInfo 点击获取图层的信息
     * @apiGroup 图层详细信息
     * @apiVersion 0.0.2
     * @apiDescription 用于获取图层的信息
     * @apiParam {JSON} tableName 表名字
     * @apiParam {JSON} type 图层类型
     * @apiParam {JSON} point 处理后的点坐标
     * @apiParamExample {json} 请求样例：
     * {
     * 	"tableName":"ghcg_zg_yzq_dtz|ghcg_zg_yzq_mlz|ghcg_zg_yzq_rdz|ghcg_zg_yzq_rhz",
     * 	"type":"geom",
     * 	"point":"MULTIPOLYGON(((37415032.95444747 2504660.2177808643,37415032.8045721 2504655.6395618184,37415032.355587766 2504651.080947409,37415031.609417096 2504646.561458323,37415030.56925531 2504642.1004477073,37415029.239556536 2504637.717018293,37415027.62601475 2504633.4299405986,37415025.73553938 2504629.257572549,37415023.576225735 2504625.2177808643,37415021.157320336 2504621.327864553,37415018.48918129 2504617.6044808337,37415015.583234 2504614.0635738075,37415012.451922156 2504610.7203061813,37415009.10865453 2504607.588994341,37415005.5677475 2504604.683047044,37415001.84436378 2504602.014908003,37414997.95444747 2504599.596002599,37414993.91465578 2504597.4366889573,37414989.74228773 2504595.5462135887,37414985.455210045 2504593.9326718,37414981.07178063 2504592.602973024,37414976.61077001 2504591.562811236,37414972.09128092 2504590.816640568,37414967.53266652 2504590.3676562374,37414962.95444747 2504590.2177808643,37414958.37622842 2504590.3676562374,37414953.81761402 2504590.816640568,37414949.29812493 2504591.562811236,37414944.83711431 2504592.602973024,37414940.453684896 2504593.9326718,37414936.16660721 2504595.5462135887,37414931.99423916 2504597.4366889573,37414927.95444747 2504599.596002599,37414924.06453116 2504602.014908003,37414920.34114744 2504604.683047044,37414916.80024041 2504607.588994341,37414913.456972785 2504610.7203061813,37414910.325660944 2504614.0635738075,37414907.41971365 2504617.6044808337,37414904.751574606 2504621.327864553,37414902.332669206 2504625.2177808643,37414900.173355564 2504629.257572549,37414898.282880194 2504633.4299405986,37414896.669338405 2504637.717018293,37414895.339639634 2504642.1004477073,37414894.299477845 2504646.561458323,37414893.553307176 2504651.080947409,37414893.10432284 2504655.6395618184,37414892.95444747 2504660.2177808643,37414893.10432284 2504664.79599991,37414893.553307176 2504669.3546143197,37414894.299477845 2504673.8741034055,37414895.339639634 2504678.3351140213,37414896.669338405 2504682.7185434354,37414898.282880194 2504687.00562113,37414900.173355564 2504691.1779891797,37414902.332669206 2504695.2177808643,37414904.751574606 2504699.107697176,37414907.41971365 2504702.831080895,37414910.325660944 2504706.371987921,37414913.456972785 2504709.7152555473,37414916.80024041 2504712.8465673877,37414920.34114744 2504715.7525146846,37414924.06453116 2504718.4206537255,37414927.95444747 2504720.8395591294,37414931.99423916 2504722.9988727714,37414936.16660721 2504724.88934814,37414940.453684896 2504726.502889929,37414944.83711431 2504727.832588705,37414949.29812493 2504728.8727504928,37414953.81761402 2504729.6189211607,37414958.37622842 2504730.067905491,37414962.95444747 2504730.2177808643,37414967.53266652 2504730.067905491,37414972.09128092 2504729.6189211607,37414976.61077001 2504728.8727504928,37414981.07178063 2504727.832588705,37414985.455210045 2504726.502889929,37414989.74228773 2504724.88934814,37414993.91465578 2504722.9988727714,37414997.95444747 2504720.8395591294,37415001.84436378 2504718.4206537255,37415005.5677475 2504715.7525146846,37415009.10865453 2504712.8465673877,37415012.451922156 2504709.7152555473,37415015.583234 2504706.371987921,37415018.48918129 2504702.831080895,37415021.157320336 2504699.107697176,37415023.576225735 2504695.2177808643,37415025.73553938 2504691.1779891797,37415027.62601475 2504687.00562113,37415029.239556536 2504682.7185434354,37415030.56925531 2504678.3351140213,37415031.609417096 2504673.8741034055,37415032.355587766 2504669.3546143197,37415032.8045721 2504664.79599991,37415032.95444747 2504660.2177808643)))"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     *[
     *     {
     *         "gid": 443,
     *         "yddm": "R2",
     *         "yddmNew": "R2",
     *         "ydmc": "二类居住用地",
     *         "ssqy": "茂林镇",
     *         "mj": 65073.8002756,
     *         "sjly": "住建委",
     *         "clsj": "2018-11-12T16:00:00.000+0000",
     *         "bz": null,
     *         "shapeLeng": 1041.09186355,
     *         "shapeArea": 65073.8002756,
     *         "geom": {
     *             "type": "geometry",
     *             "value": "01060000000100000001030000000100000011000000B150EB9F44D78141006F8144511C434183C0CAA044D78141ACCFD5C64E1C4341BC9690D444D78141D019511ABB1B43412AA913D544D7814164AA60A4B91B43419418846B44D781413C70CE60B11B434108AC9C5444D78141DC8AFD15B11B434150FC18843FD781414013615BA11B4341A5BD416E3FD7814128310814A11B4341BBB80DD73ED78141CCAACF3DA81B4341F1F44AD73ED78141705F073EAA1B43411FF4ECEA3ED78141905CFE634E1C434135EF38EB3ED781411C0DE0DD501C4341D81272693FD781411804564E571C4341FE6577783FD781418C976E52571C434175021AFE43D78141ACD85F8E581C43418B6CE71944D7814120FDF695581C4341B150EB9F44D78141006F8144511C4341"
     *         }
     *     }
     * ]
     */

    @UserLoginToken
    @PostMapping(value = "/getLayerInfo")
    public Object getLayerInfo(@RequestBody Map<String, Object> models, HttpServletResponse httpServletResponse) throws Exception {
        LayerInfoUtil layerInfoUtil  = JsonXMLUtils.map2obj((Map<String, Object>) models.get("layerinfo"), LayerInfoUtil.class);
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        Map map = layerInfoService.getLayerInfo(layerInfoUtil);
//        Set keySet = map.keySet();

//        List<Object> list = new ArrayList<>();
//        for(Object keyName:keySet){
//            list.add(keyName);
//        }
//        map.put("list",list);
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
