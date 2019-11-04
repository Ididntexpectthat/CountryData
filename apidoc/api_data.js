define({ "api": [
  {
    "type": "POST",
    "url": "EconomicData/classification",
    "title": "分类",
    "group": "经济数据",
    "version": "0.0.2",
    "description": "<p>用于分类</p>",
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
          "content": "  [\n    {\n        \"tableName\": \"玉林市历年北流市生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年博白县生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年福绵区生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年陆川县生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年容县生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年兴业县生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年玉州区生产总值统计1998_2014\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年北流市生产总值统计1998_2015\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年博白县生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年北流市生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年福绵区生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年陆川县生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年容县生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年兴业县生产总值统计1998_2016\",\n        \"particularYear\": null\n    },\n    {\n        \"tableName\": \"玉林市历年玉州区生产总值统计1998_2016\",\n        \"particularYear\": null\n    }\n]",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/ydl/api/EconomicDataApi.java",
    "groupTitle": "经济数据",
    "name": "PostEconomicdataClassification",
    "sampleRequest": [
      {
        "url": "http://localhost:8888/EconomicData/classification"
      }
    ]
  },
  {
    "type": "POST",
    "url": "EconomicData/subRegion",
    "title": "分地区",
    "group": "经济数据",
    "version": "0.0.2",
    "description": "<p>用于注分地区</p>",
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
          "content": "{\n\t\"tableName\":\"农业主要经济指标\"\n}",
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
          "content": " {\n    \"economicDataList\": [\n        {\n            \"tableName\": \"玉林市历年北流市农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        },\n        {\n            \"tableName\": \"玉林市历年博白县农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        },\n        {\n            \"tableName\": \"玉林市历年福绵区农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        },\n        {\n            \"tableName\": \"玉林市历年容县农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        },\n        {\n            \"tableName\": \"玉林市历年兴业县农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        },\n        {\n            \"tableName\": \"玉林市历年玉州区农业主要经济指标统计2006_2014\",\n            \"particularYear\": null\n        }\n    ],\n    \"list\": [\n        \"北流市\",\n        \"博白县\",\n        \"福绵区\",\n        \"容县农\",\n        \"兴业县\",\n        \"玉州区\"\n    ]\n}",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/ydl/api/EconomicDataApi.java",
    "groupTitle": "经济数据",
    "name": "PostEconomicdataSubregion",
    "sampleRequest": [
      {
        "url": "http://localhost:8888/EconomicData/subRegion"
      }
    ]
  },
  {
    "type": "POST",
    "url": "MainEconomicIndicatorsOfAgriculture/getDataByTableName",
    "title": "农业主要经济指标",
    "group": "经济数据",
    "version": "0.0.2",
    "description": "<p>用于获取农业主要经济指标数据</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "JSON",
            "optional": false,
            "field": "tableName",
            "description": "<p>分类名字</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求样例：",
          "content": "{\n\t\"tableName\":\"经济数据.玉林市历年北流市农业主要经济指标统计2006_2014\"\n}",
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
          "content": "[\n    {\n        \"编号\": 1,\n        \"年份\": 2006,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 25.46,\n        \"乡镇村人口数万人\": 110.5,\n        \"乡镇村劳动力万人\": 65.71,\n        \"乡镇村从业人员数万人\": 58.32,\n        \"当机耕地面积公顷\": 13322,\n        \"农村用电量万千瓦时\": 8350,\n        \"化肥施用量吨\": 29838,\n        \"肉类总产量吨\": 71077,\n        \"牛存栏头\": 67788,\n        \"猪出栏头\": 654879,\n        \"猪肉产量吨\": 47360,\n        \"猪存栏头\": 797309,\n        \"家禽出栏万只\": 1631.0,\n        \"禽肉产量吨\": 21921,\n        \"家禽存栏万只\": 804.2,\n        \"农林牧渔业总产值万元\": 316234,\n        \"农林牧渔业总产值指数\": 104.72,\n        \"农业产值万元\": 169671,\n        \"农业产值指数\": 103.29,\n        \"林业产值万元\": 6486,\n        \"林业产值指数\": 97.56,\n        \"牧业产值万元\": 119006,\n        \"牧业产值指数\": 106.95,\n        \"渔业产值万元\": 18482,\n        \"渔业产值指数\": 106.22,\n        \"水果产量吨\": 129660,\n        \"荔枝产量吨\": 58800,\n        \"龙眼产量吨\": 23900,\n        \"水产品产量吨\": 22172,\n        \"粮食种植面积公顷\": 63399,\n        \"粮食产量吨\": 378631,\n        \"早稻种植面积公顷\": 27727,\n        \"早稻产量吨\": 183854,\n        \"晚稻种植面积公顷\": 28542,\n        \"晚稻产量吨\": 173657,\n        \"玉米种植面积公顷\": 1044,\n        \"玉米产量吨\": 4167,\n        \"豆类种植面积公顷\": 1682,\n        \"豆类产量吨\": 3293,\n        \"红薯种植面积公顷\": 4374,\n        \"红薯产量吨\": 13570\n    },\n    {\n        \"编号\": 2,\n        \"年份\": 2007,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 25.17,\n        \"乡镇村人口数万人\": 110.89,\n        \"乡镇村劳动力万人\": 66.36,\n        \"乡镇村从业人员数万人\": 57.87,\n        \"当机耕地面积公顷\": 14424,\n        \"农村用电量万千瓦时\": 9189,\n        \"化肥施用量吨\": 30923,\n        \"肉类总产量吨\": 73444,\n        \"牛存栏头\": 70465,\n        \"猪出栏头\": 642279,\n        \"猪肉产量吨\": 46880,\n        \"猪存栏头\": 797309,\n        \"家禽出栏万只\": 1827.6,\n        \"禽肉产量吨\": 24645,\n        \"家禽存栏万只\": 810.7,\n        \"农林牧渔业总产值万元\": 362662,\n        \"农林牧渔业总产值指数\": 104.38,\n        \"农业产值万元\": 178010,\n        \"农业产值指数\": 103.93,\n        \"林业产值万元\": 8260,\n        \"林业产值指数\": 115.36,\n        \"牧业产值万元\": 136840,\n        \"牧业产值指数\": 104.24,\n        \"渔业产值万元\": 16743,\n        \"渔业产值指数\": 104.33,\n        \"水果产量吨\": 155630,\n        \"荔枝产量吨\": 63800,\n        \"龙眼产量吨\": 20000,\n        \"水产品产量吨\": 22974,\n        \"粮食种植面积公顷\": 60741,\n        \"粮食产量吨\": 355407,\n        \"早稻种植面积公顷\": 26224,\n        \"早稻产量吨\": 174012,\n        \"晚稻种植面积公顷\": 27187,\n        \"晚稻产量吨\": 159461,\n        \"玉米种植面积公顷\": 1078,\n        \"玉米产量吨\": 4388,\n        \"豆类种植面积公顷\": 1722,\n        \"豆类产量吨\": 3410,\n        \"红薯种植面积公顷\": 4498,\n        \"红薯产量吨\": 14046\n    },\n    {\n        \"编号\": 3,\n        \"年份\": 2008,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 25.3,\n        \"乡镇村人口数万人\": 111.88,\n        \"乡镇村劳动力万人\": 69.77,\n        \"乡镇村从业人员数万人\": 60.53,\n        \"当机耕地面积公顷\": 40129,\n        \"农村用电量万千瓦时\": 10988,\n        \"化肥施用量吨\": 31281,\n        \"肉类总产量吨\": 78496,\n        \"牛存栏头\": 70500,\n        \"猪出栏头\": 675400,\n        \"猪肉产量吨\": 49300,\n        \"猪存栏头\": 829400,\n        \"家禽出栏万只\": 2011.16,\n        \"禽肉产量吨\": 27117,\n        \"家禽存栏万只\": null,\n        \"农林牧渔业总产值万元\": 409028,\n        \"农林牧渔业总产值指数\": 101.34,\n        \"农业产值万元\": 187985,\n        \"农业产值指数\": 96.35,\n        \"林业产值万元\": 8019,\n        \"林业产值指数\": 93.66,\n        \"牧业产值万元\": 168115,\n        \"牧业产值指数\": 107.15,\n        \"渔业产值万元\": 20276,\n        \"渔业产值指数\": 103.0,\n        \"水果产量吨\": 117858,\n        \"荔枝产量吨\": 35090,\n        \"龙眼产量吨\": 20000,\n        \"水产品产量吨\": 23663,\n        \"粮食种植面积公顷\": 60814,\n        \"粮食产量吨\": 354540,\n        \"早稻种植面积公顷\": 26224,\n        \"早稻产量吨\": 172314,\n        \"晚稻种植面积公顷\": 27149,\n        \"晚稻产量吨\": 160043,\n        \"玉米种植面积公顷\": 1159,\n        \"玉米产量吨\": 4696,\n        \"豆类种植面积公顷\": 1791,\n        \"豆类产量吨\": 3530,\n        \"红薯种植面积公顷\": 4459,\n        \"红薯产量吨\": 13867\n    },\n    {\n        \"编号\": 4,\n        \"年份\": 2009,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 25.54,\n        \"乡镇村人口数万人\": 112.95,\n        \"乡镇村劳动力万人\": 70.99,\n        \"乡镇村从业人员数万人\": 61.16,\n        \"当机耕地面积公顷\": 45896,\n        \"农村用电量万千瓦时\": 12928,\n        \"化肥施用量吨\": 32268,\n        \"肉类总产量吨\": 82134,\n        \"牛存栏头\": 70300,\n        \"猪出栏头\": 711300,\n        \"猪肉产量吨\": 51925,\n        \"猪存栏头\": 860000,\n        \"家禽出栏万只\": 2082.38,\n        \"禽肉产量吨\": 28077,\n        \"家禽存栏万只\": 999.92,\n        \"农林牧渔业总产值万元\": 412953,\n        \"农林牧渔业总产值指数\": 106.11,\n        \"农业产值万元\": 202789,\n        \"农业产值指数\": 106.24,\n        \"林业产值万元\": 7641,\n        \"林业产值指数\": 135.03,\n        \"牧业产值万元\": 156173,\n        \"牧业产值指数\": 104.59,\n        \"渔业产值万元\": 19670,\n        \"渔业产值指数\": 103.7,\n        \"水果产量吨\": 159700,\n        \"荔枝产量吨\": 64010,\n        \"龙眼产量吨\": 19020,\n        \"水产品产量吨\": 24623,\n        \"粮食种植面积公顷\": 62133,\n        \"粮食产量吨\": 362622,\n        \"早稻种植面积公顷\": 26282,\n        \"早稻产量吨\": 173482,\n        \"晚稻种植面积公顷\": 27154,\n        \"晚稻产量吨\": 160493,\n        \"玉米种植面积公顷\": 1245,\n        \"玉米产量吨\": 5013,\n        \"豆类种植面积公顷\": 1933,\n        \"豆类产量吨\": 3990,\n        \"红薯种植面积公顷\": 4728,\n        \"红薯产量吨\": 14720\n    },\n    {\n        \"编号\": 5,\n        \"年份\": 2010,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 25.75,\n        \"乡镇村人口数万人\": 114.06,\n        \"乡镇村劳动力万人\": 71.66,\n        \"乡镇村从业人员数万人\": 61.75,\n        \"当机耕地面积公顷\": 47537,\n        \"农村用电量万千瓦时\": 14498,\n        \"化肥施用量吨\": 32590,\n        \"肉类总产量吨\": 85453,\n        \"牛存栏头\": 71100,\n        \"猪出栏头\": 738500,\n        \"猪肉产量吨\": 54180,\n        \"猪存栏头\": 887100,\n        \"家禽出栏万只\": 2151.52,\n        \"禽肉产量吨\": 29000,\n        \"家禽存栏万只\": 1061.91,\n        \"农林牧渔业总产值万元\": 459024,\n        \"农林牧渔业总产值指数\": 103.85,\n        \"农业产值万元\": 229636,\n        \"农业产值指数\": 102.98,\n        \"林业产值万元\": 17046,\n        \"林业产值指数\": 104.23,\n        \"牧业产值万元\": 162031,\n        \"牧业产值指数\": 104.11,\n        \"渔业产值万元\": 21348,\n        \"渔业产值指数\": 104.23,\n        \"水果产量吨\": 180338,\n        \"荔枝产量吨\": 68651,\n        \"龙眼产量吨\": 21010,\n        \"水产品产量吨\": 25632,\n        \"粮食种植面积公顷\": 61784,\n        \"粮食产量吨\": 350217,\n        \"早稻种植面积公顷\": 26082,\n        \"早稻产量吨\": 168278,\n        \"晚稻种植面积公顷\": 26954,\n        \"晚稻产量吨\": 161295,\n        \"玉米种植面积公顷\": 1288,\n        \"玉米产量吨\": 4365,\n        \"豆类种植面积公顷\": 1941,\n        \"豆类产量吨\": 3041,\n        \"红薯种植面积公顷\": 4688,\n        \"红薯产量吨\": 9552\n    },\n    {\n        \"编号\": 6,\n        \"年份\": 2011,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 26.01,\n        \"乡镇村人口数万人\": 115.2,\n        \"乡镇村劳动力万人\": 72.38,\n        \"乡镇村从业人员数万人\": 62.37,\n        \"当机耕地面积公顷\": 52433,\n        \"农村用电量万千瓦时\": 17253,\n        \"化肥施用量吨\": 32916,\n        \"肉类总产量吨\": 86987,\n        \"牛存栏头\": 73200,\n        \"猪出栏头\": 742500,\n        \"猪肉产量吨\": 54741,\n        \"猪存栏头\": 920500,\n        \"家禽出栏万只\": 2213.5,\n        \"禽肉产量吨\": 29835,\n        \"家禽存栏万只\": 1063.17,\n        \"农林牧渔业总产值万元\": 562560,\n        \"农林牧渔业总产值指数\": 104.5,\n        \"农业产值万元\": 265173,\n        \"农业产值指数\": 105.5,\n        \"林业产值万元\": 20922,\n        \"林业产值指数\": 103.5,\n        \"牧业产值万元\": 216754,\n        \"牧业产值指数\": 102.0,\n        \"渔业产值万元\": 26930,\n        \"渔业产值指数\": 105.0,\n        \"水果产量吨\": 201668,\n        \"荔枝产量吨\": 73650,\n        \"龙眼产量吨\": 26530,\n        \"水产品产量吨\": 26915,\n        \"粮食种植面积公顷\": 62433,\n        \"粮食产量吨\": 350792,\n        \"早稻种植面积公顷\": 25860,\n        \"早稻产量吨\": 169708,\n        \"晚稻种植面积公顷\": 27135,\n        \"晚稻产量吨\": 153556,\n        \"玉米种植面积公顷\": 1922,\n        \"玉米产量吨\": 9396,\n        \"豆类种植面积公顷\": 1953,\n        \"豆类产量吨\": 3196,\n        \"红薯种植面积公顷\": 4722,\n        \"红薯产量吨\": 10705\n    },\n    {\n        \"编号\": 7,\n        \"年份\": 2012,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 26.35,\n        \"乡镇村人口数万人\": 116.16,\n        \"乡镇村劳动力万人\": 73.32,\n        \"乡镇村从业人员数万人\": 63.12,\n        \"当机耕地面积公顷\": 52198,\n        \"农村用电量万千瓦时\": 20824,\n        \"化肥施用量吨\": 33246,\n        \"肉类总产量吨\": 90378,\n        \"牛存栏头\": 73200,\n        \"猪出栏头\": 775300,\n        \"猪肉产量吨\": 57172,\n        \"猪存栏头\": 930000,\n        \"家禽出栏万只\": 2281.28,\n        \"禽肉产量吨\": 30750,\n        \"家禽存栏万只\": 999.38,\n        \"农林牧渔业总产值万元\": 604900,\n        \"农林牧渔业总产值指数\": 106.31,\n        \"农业产值万元\": 308086,\n        \"农业产值指数\": 107.58,\n        \"林业产值万元\": 24220,\n        \"林业产值指数\": 111.99,\n        \"牧业产值万元\": 209133,\n        \"牧业产值指数\": 103.8,\n        \"渔业产值万元\": 26759,\n        \"渔业产值指数\": 105.12,\n        \"水果产量吨\": 224850,\n        \"荔枝产量吨\": 80005,\n        \"龙眼产量吨\": 25350,\n        \"水产品产量吨\": 28269,\n        \"粮食种植面积公顷\": 62690,\n        \"粮食产量吨\": 372775,\n        \"早稻种植面积公顷\": 25858,\n        \"早稻产量吨\": 174370,\n        \"晚稻种植面积公顷\": 27025,\n        \"晚稻产量吨\": 168068,\n        \"玉米种植面积公顷\": 1984,\n        \"玉米产量吨\": 10226,\n        \"豆类种植面积公顷\": 1988,\n        \"豆类产量吨\": 3436,\n        \"红薯种植面积公顷\": 4751,\n        \"红薯产量吨\": 11307\n    },\n    {\n        \"编号\": 8,\n        \"年份\": 2013,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 26.72,\n        \"乡镇村人口数万人\": 117.32,\n        \"乡镇村劳动力万人\": 74.35,\n        \"乡镇村从业人员数万人\": 63.94,\n        \"当机耕地面积公顷\": 67491,\n        \"农村用电量万千瓦时\": 22373,\n        \"化肥施用量吨\": 34230,\n        \"肉类总产量吨\": 91093,\n        \"牛存栏头\": 73200,\n        \"猪出栏头\": 790800,\n        \"猪肉产量吨\": 58549,\n        \"猪存栏头\": 930000,\n        \"家禽出栏万只\": 2228.28,\n        \"禽肉产量吨\": 30046,\n        \"家禽存栏万只\": 1188.0,\n        \"农林牧渔业总产值万元\": 645755,\n        \"农林牧渔业总产值指数\": 104.7,\n        \"农业产值万元\": 332219,\n        \"农业产值指数\": 104.03,\n        \"林业产值万元\": 33102,\n        \"林业产值指数\": 130.65,\n        \"牧业产值万元\": 208266,\n        \"牧业产值指数\": 100.79,\n        \"渔业产值万元\": 29218,\n        \"渔业产值指数\": 105.39,\n        \"水果产量吨\": 237300,\n        \"荔枝产量吨\": 77890,\n        \"龙眼产量吨\": 27135,\n        \"水产品产量吨\": 29856,\n        \"粮食种植面积公顷\": 63137,\n        \"粮食产量吨\": 380868,\n        \"早稻种植面积公顷\": 25858,\n        \"早稻产量吨\": 176480,\n        \"晚稻种植面积公顷\": 27200,\n        \"晚稻产量吨\": 171694,\n        \"玉米种植面积公顷\": 2180,\n        \"玉米产量吨\": 11943,\n        \"豆类种植面积公顷\": 2062,\n        \"豆类产量吨\": 3737,\n        \"红薯种植面积公顷\": 4834,\n        \"红薯产量吨\": 12003\n    },\n    {\n        \"编号\": 9,\n        \"年份\": 2014,\n        \"乡镇不包括街道个\": 22,\n        \"村民委员会个\": 278,\n        \"乡村户数万户\": 27.09,\n        \"乡镇村人口数万人\": 118.96,\n        \"乡镇村劳动力万人\": 75.39,\n        \"乡镇村从业人员数万人\": 64.83,\n        \"当机耕地面积公顷\": 66096,\n        \"农村用电量万千瓦时\": 25240,\n        \"化肥施用量吨\": 35257,\n        \"肉类总产量吨\": 91826,\n        \"牛存栏头\": 73200,\n        \"猪出栏头\": 804000,\n        \"猪肉产量吨\": 60017,\n        \"猪存栏头\": 930000,\n        \"家禽出栏万只\": 2110.93,\n        \"禽肉产量吨\": 28469,\n        \"家禽存栏万只\": 1200.0,\n        \"农林牧渔业总产值万元\": 684532,\n        \"农林牧渔业总产值指数\": 104.89,\n        \"农业产值万元\": 356962,\n        \"农业产值指数\": 104.84,\n        \"林业产值万元\": 40731,\n        \"林业产值指数\": 122.42,\n        \"牧业产值万元\": 204303,\n        \"牧业产值指数\": 99.98,\n        \"渔业产值万元\": 32736,\n        \"渔业产值指数\": 105.71,\n        \"水果产量吨\": 265540,\n        \"荔枝产量吨\": 88802,\n        \"龙眼产量吨\": 30400,\n        \"水产品产量吨\": 31158,\n        \"粮食种植面积公顷\": 61580,\n        \"粮食产量吨\": 359681,\n        \"早稻种植面积公顷\": 24570,\n        \"早稻产量吨\": 152020,\n        \"晚稻种植面积公顷\": 26600,\n        \"晚稻产量吨\": 174547,\n        \"玉米种植面积公顷\": 1960,\n        \"玉米产量吨\": 10278,\n        \"豆类种植面积公顷\": 1760,\n        \"豆类产量吨\": 3279,\n        \"红薯种植面积公顷\": 4870,\n        \"红薯产量吨\": 12741\n    }\n]",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/ydl/api/MainEconomicIndicatorsOfAgricultureApi.java",
    "groupTitle": "经济数据",
    "name": "PostMaineconomicindicatorsofagricultureGetdatabytablename",
    "sampleRequest": [
      {
        "url": "http://localhost:8888/MainEconomicIndicatorsOfAgriculture/getDataByTableName"
      }
    ]
  },
  {
    "type": "POST",
    "url": "RuralPerCapitaNetIncome/getDataByTableName",
    "title": "农业主要经济指标",
    "group": "经济数据",
    "version": "0.0.2",
    "description": "<p>用于获取农业主要经济指标数据</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "JSON",
            "optional": false,
            "field": "tableName",
            "description": "<p>分类名字</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求样例：",
          "content": "{\n\t\"tableName\":\"经济数据.玉林市历年各县市区农民人均纯收入统计2000_2016\"\n}",
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
          "content": "[\n    {\n        \"编号\": 1,\n        \"年份\": 2000,\n        \"玉林市\": 1736,\n        \"玉州区\": 1896,\n        \"福棉区\": 1810,\n        \"容县\": 1611,\n        \"陆川县\": 1667,\n        \"博白县\": 1604,\n        \"兴业县\": 1644,\n        \"北流市\": 2014,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 2,\n        \"年份\": 2001,\n        \"玉林市\": 1839,\n        \"玉州区\": 1984,\n        \"福棉区\": 1919,\n        \"容县\": 1703,\n        \"陆川县\": 1773,\n        \"博白县\": 1719,\n        \"兴业县\": 1704,\n        \"北流市\": 2139,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 3,\n        \"年份\": 2002,\n        \"玉林市\": 1959,\n        \"玉州区\": 2088,\n        \"福棉区\": 2022,\n        \"容县\": 1801,\n        \"陆川县\": 1872,\n        \"博白县\": 1860,\n        \"兴业县\": 1806,\n        \"北流市\": 2281,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 4,\n        \"年份\": 2003,\n        \"玉林市\": 2035,\n        \"玉州区\": 2149,\n        \"福棉区\": 2047,\n        \"容县\": 1895,\n        \"陆川县\": 1976,\n        \"博白县\": 1933,\n        \"兴业县\": 1948,\n        \"北流市\": 2308,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 5,\n        \"年份\": 2004,\n        \"玉林市\": 2259,\n        \"玉州区\": 2460,\n        \"福棉区\": 2230,\n        \"容县\": 2192,\n        \"陆川县\": 2235,\n        \"博白县\": 2062,\n        \"兴业县\": 2200,\n        \"北流市\": 2551,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 6,\n        \"年份\": 2005,\n        \"玉林市\": 2573,\n        \"玉州区\": 2883,\n        \"福棉区\": 2519,\n        \"容县\": 2541,\n        \"陆川县\": 2526,\n        \"博白县\": 2367,\n        \"兴业县\": 2444,\n        \"北流市\": 2884,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 7,\n        \"年份\": 2006,\n        \"玉林市\": 3041,\n        \"玉州区\": 3573,\n        \"福棉区\": 2988,\n        \"容县\": 2998,\n        \"陆川县\": 2989,\n        \"博白县\": 2797,\n        \"兴业县\": 2807,\n        \"北流市\": 3414,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 8,\n        \"年份\": 2007,\n        \"玉林市\": 3536,\n        \"玉州区\": 4173,\n        \"福棉区\": 3452,\n        \"容县\": 3469,\n        \"陆川县\": 3484,\n        \"博白县\": 3252,\n        \"兴业县\": 3251,\n        \"北流市\": 3964,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 9,\n        \"年份\": 2008,\n        \"玉林市\": 4123,\n        \"玉州区\": 4970,\n        \"福棉区\": 4148,\n        \"容县\": 4066,\n        \"陆川县\": 4086,\n        \"博白县\": 3814,\n        \"兴业县\": 3806,\n        \"北流市\": 4500,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 10,\n        \"年份\": 2009,\n        \"玉林市\": 4531,\n        \"玉州区\": 5396,\n        \"福棉区\": 4536,\n        \"容县\": 4470,\n        \"陆川县\": 4525,\n        \"博白县\": 4215,\n        \"兴业县\": 4143,\n        \"北流市\": 4917,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 11,\n        \"年份\": 2010,\n        \"玉林市\": 5302,\n        \"玉州区\": 6229,\n        \"福棉区\": 5233,\n        \"容县\": 5186,\n        \"陆川县\": 5274,\n        \"博白县\": 5084,\n        \"兴业县\": 4783,\n        \"北流市\": 5686,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 12,\n        \"年份\": 2011,\n        \"玉林市\": 6269,\n        \"玉州区\": 7226,\n        \"福棉区\": 6071,\n        \"容县\": 6043,\n        \"陆川县\": 6228,\n        \"博白县\": 6150,\n        \"兴业县\": 5592,\n        \"北流市\": 6726,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 13,\n        \"年份\": 2012,\n        \"玉林市\": 7269,\n        \"玉州区\": 8371,\n        \"福棉区\": 7055,\n        \"容县\": 7012,\n        \"陆川县\": 7207,\n        \"博白县\": 7127,\n        \"兴业县\": 6483,\n        \"北流市\": 7795,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 14,\n        \"年份\": 2013,\n        \"玉林市\": 8272,\n        \"玉州区\": 9518,\n        \"福棉区\": 8057,\n        \"容县\": 7994,\n        \"陆川县\": 8180,\n        \"博白县\": 8118,\n        \"兴业县\": 7384,\n        \"北流市\": 8871,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 15,\n        \"年份\": 2014,\n        \"玉林市\": 9314,\n        \"玉州区\": 10736,\n        \"福棉区\": 9040,\n        \"容县\": 9033,\n        \"陆川县\": 9153,\n        \"博白县\": 9133,\n        \"兴业县\": 8270,\n        \"北流市\": 10042,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 16,\n        \"年份\": 2015,\n        \"玉林市\": 10292,\n        \"玉州区\": 11810,\n        \"福棉区\": 10016,\n        \"容县\": 9918,\n        \"陆川县\": 10087,\n        \"博白县\": 10092,\n        \"兴业县\": 9130,\n        \"北流市\": 11106,\n        \"玉东新区\": null\n    },\n    {\n        \"编号\": 17,\n        \"年份\": 2016,\n        \"玉林市\": 12590,\n        \"玉州区\": 14274,\n        \"福棉区\": 12274,\n        \"容县\": 11940,\n        \"陆川县\": 11980,\n        \"博白县\": 11984,\n        \"兴业县\": 11167,\n        \"北流市\": 13461,\n        \"玉东新区\": null\n    }\n]",
          "type": "json"
        }
      ]
    },
    "filename": "src/main/java/com/ydl/api/RuralPerCapitaNetIncomeApi.java",
    "groupTitle": "经济数据",
    "name": "PostRuralpercapitanetincomeGetdatabytablename",
    "sampleRequest": [
      {
        "url": "http://localhost:8888/RuralPerCapitaNetIncome/getDataByTableName"
      }
    ]
  }
] });
