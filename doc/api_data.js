define({ "api": [
  {
    "type": "POST",
    "url": "/classification",
    "title": "分类",
    "group": "EconomicData",
    "version": "0.0.1",
    "description": "<p>用于注册用户</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "JSON",
            "optional": false,
            "field": "tableName",
            "description": "<p>分类名字</p>"
          },
          {
            "group": "Parameter",
            "type": "JSON",
            "optional": false,
            "field": "particularYear",
            "description": "<p>年份(可选)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求样例：",
          "content": " {\n\t\"tableName\":\"生产总值\",\n\t\"particularYear\":\"14\"\n}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "200": [
          {
            "group": "200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>信息</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "返回样例:",
          "content": "             [\n    \"玉林市历年北流市生产总值统计1998_2014\",\n    \"玉林市历年博白县生产总值统计1998_2014\",\n    \"玉林市历年福绵区生产总值统计1998_2014\",\n    \"玉林市历年陆川县生产总值统计1998_2014\",\n    \"玉林市历年容县生产总值统计1998_2014\",\n    \"玉林市历年兴业县生产总值统计1998_2014\",\n    \"玉林市历年玉州区生产总值统计1998_2014\",\n    \"玉林市历年北流市生产总值统计1998_2015\",\n    \"玉林市历年博白县生产总值统计1998_2016\",\n    \"玉林市历年北流市生产总值统计1998_2016\",\n    \"玉林市历年福绵区生产总值统计1998_2016\",\n    \"玉林市历年陆川县生产总值统计1998_2016\",\n    \"玉林市历年容县生产总值统计1998_2016\",\n    \"玉林市历年兴业县生产总值统计1998_2016\",\n    \"玉林市历年玉州区生产总值统计1998_2016\"\n]",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/ydl/api/EconomicDataApi.java",
    "groupTitle": "EconomicData",
    "name": "PostClassification",
    "sampleRequest": [
      {
        "url": "http://localhost:8888//classification"
      }
    ]
  }
] });
