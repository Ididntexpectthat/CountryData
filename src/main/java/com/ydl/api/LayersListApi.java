package com.ydl.api;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ydl.annotation.UserLoginToken;
import com.ydl.config.JsonXMLUtils;
import com.ydl.entity.LayersList;
import com.ydl.service.LayersListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Layers")
public class LayersListApi {
    @Autowired
    LayersListService layersListService;

    //分页获取图层
    @UserLoginToken
    @PostMapping(value = "/getAllLayersListPaging")
    public Object getAllLayersListPaging(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        String pagenum = httpServletRequest.getHeader("pagenum");
        if (StringUtils.isEmpty(pagenum)) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "页码不能为空！!");
            return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
        }
        Page page = PageHelper.startPage(Integer.parseInt(pagenum), 10);
        List<LayersList> list = layersListService.getAllLayerList();
        PageInfo info = new PageInfo<>(page.getResult());
        String pageCount = info.getPages() + "";
        httpServletResponse.setHeader("pageCount", pageCount);
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    /**
     * 获取所有图层
     *
     * @param httpServletResponse
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/getAllLayersList")
    public Object getAllLayersList(HttpServletResponse httpServletResponse) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        List<LayersList> list = layersListService.getAllLayerList();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }
    /**
     * @apiName Layers_classifiedQueryLayersList
     * @api {POST} Layers/classifiedQueryLayersList 分类搜索图层
     * @apiGroup 图层列表
     * @apiVersion 0.0.2
     * @apiDescription 用于分类搜索图层
     * @apiParam {JSON} [keyVaClue] 表名(只可二选一)
     * @apiParam {JSON} [name] 名字
     * @apiHeaderParam {JSON} pagenum 页数
     * @apiParamExample {json} 请求样例：
     *   {
     * 	"name":"交"
     * }
     * @apiSuccess (200) {String} msg 信息
     * @apiSuccessExample {json} 返回样例:
     * [
     *     {
     *         "id": 15,
     *         "name": "公交线路",
     *         "url": "http://10.250.0.120:6080/arcgis/rest/services/GHYZT/SZSJ_GGJT_GJXL/MapServer",
     *         "type": "MapImageLayer",
     *         "copyright": "公交线路",
     *         "keyValue": "SZSJ_GGJT_GJXL",
     *         "updatetime": "",
     *         "modifytime": "",
     *         "groupname": "公共专题数据",
     *         "childgroup": "公共交通",
     *         "datatype": "szsj_ggjt_gjxl",
     *         "datasources": "",
     *         "dataaging": "",
     *         "remarks": ""
     *     },
     *     {
     *         "id": 16,
     *         "name": "公交站场",
     *         "url": "http://10.250.0.120:6080/arcgis/rest/services/GHYZT/SZSJ_GGJT_GJZC/MapServer",
     *         "type": "MapImageLayer",
     *         "copyright": "公交站场",
     *         "keyValue": "SZSJ_GGJT_GJZC",
     *         "updatetime": "",
     *         "modifytime": "",
     *         "groupname": "公共专题数据",
     *         "childgroup": "公共交通",
     *         "datatype": "szsj_ggjt_gjzc",
     *         "datasources": "",
     *         "dataaging": "",
     *         "remarks": ""
     *     },
     *     {
     *         "id": 14,
     *         "name": "公交站点",
     *         "url": "http://10.250.0.120:6080/arcgis/rest/services/GHYZT/SZSJ_GGJT_GJZD/MapServer",
     *         "type": "MapImageLayer",
     *         "copyright": "公交站点",
     *         "keyValue": "SZSJ_GGJT_GJZD",
     *         "updatetime": "",
     *         "modifytime": "",
     *         "groupname": "公共专题数据",
     *         "childgroup": "公共交通",
     *         "datatype": "szsj_ggjt_gjzd",
     *         "datasources": "",
     *         "dataaging": "",
     *         "remarks": ""
     *     },
     *     {
     *         "id": 29,
     *         "name": "市域综合交通规划",
     *         "url": "http://10.250.0.120:6080/arcgis/rest/services/GHYZT/GHCG_ZX_SYZHJT/MapServer",
     *         "type": "MapImageLayer",
     *         "copyright": "市域综合交通规划",
     *         "keyValue": "GHCG_ZX_SYZHJT",
     *         "updatetime": "",
     *         "modifytime": "",
     *         "groupname": "本地扩展数据",
     *         "childgroup": "专项规划",
     *         "datatype": "ghcg_zx_zhjt_sy",
     *         "datasources": "",
     *         "dataaging": "",
     *         "remarks": ""
     *     }
     * ]
     *
     */
    @UserLoginToken
    @PostMapping(value = "/classifiedQueryLayersList")
    public Object classifiedQueryLayersList(@RequestBody LayersList layersList,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
        String classificationType = httpServletRequest.getHeader("classificationType");
        String pagenum = httpServletRequest.getHeader("pagenum");
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        Page page = PageHelper.startPage(Integer.parseInt(pagenum), 10);
        List<LayersList> list = layersListService.classifiedQueryLayersList(layersList,classificationType);
        PageInfo info = new PageInfo<>(page.getResult());
        String pageCount = info.getPages() + "";
        httpServletResponse.setHeader("pageCount", pageCount);

        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    @UserLoginToken
    @PostMapping(value = "/insertSelective")
    public Object insertSelective(@RequestBody LayersList layersList) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        JSONObject jsonObject = new JSONObject();
//        System.out.println(layersListService.selectByName(layersList));

            int a =layersListService.insertSelective(layersList);
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            String updatetime = dateFormat.format(date);
            System.out.println(updatetime);
            layersListService.updateUpdateTime(updatetime, layersList.getName());
            jsonObject.put("int",a);
            jsonObject.put("message", "添加成功");
            return new ResponseEntity(jsonObject, HttpStatus.OK);

//        int a =layersListService.insertSelective(layersList);
//        jsonObject.put("int",a);
//        jsonObject.put("message", "添加失败，名字已经存在!");
//        return new ResponseEntity(jsonObject, HttpStatus.UNAUTHORIZED);
    }

    @UserLoginToken
    @PostMapping(value = "/updateByNameSelective")
    public Object updateByNameSelective(@RequestBody Map<String,Object> models) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        LayersList oldLayersList = JsonXMLUtils.map2LayersList((Map<String, Object>) models.get("oldLayersList"), LayersList.class);
        LayersList newLayersList = JsonXMLUtils.map2LayersList((Map<String, Object>) models.get("newLayersList"), LayersList.class);
        JSONObject jsonObject = new JSONObject();
        System.out.println(oldLayersList.getName()+"   "+newLayersList.getName());
        int a = layersListService.updateByNameSelective(oldLayersList,newLayersList);
        jsonObject.put("inta",a);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String modifytime = dateFormat.format(date);
        System.out.println(modifytime);
        int b = layersListService.updateModifyTime(modifytime, newLayersList.getName());
        jsonObject.put("intb",b);
        jsonObject.put("message", "修改成功");
        return new ResponseEntity(jsonObject, HttpStatus.OK);

    }

    @UserLoginToken
    @PostMapping(value = "/deleteLayersByName")
    public Object deleteLayersByName(@RequestBody LayersList layersList) {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");

        JSONObject jsonObject = new JSONObject();
        int a =layersListService.deleteLayersByName(layersList);
        jsonObject.put("inta",a);
        jsonObject.put("message", "删除成功");
        return new ResponseEntity(jsonObject, HttpStatus.OK);

    }
}
