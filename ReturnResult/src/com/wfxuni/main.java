package com.wfxuni;

import com.wfxuni.pojo.News;
import com.wfxuni.result.JsonResult;
import com.wfxuni.result.ResultCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        LocalDateTime rightNow = LocalDateTime.now();
        String publicTime = rightNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        News news = new News("corna", "piao", "so funny!", publicTime);
        Map<String, Object> map = new HashMap<>();
        map.put("1", news);

        JsonResult<Map<String, String>> jsonResult;
        ResultCode code = ResultCode.SUCCESS;
        jsonResult = new JsonResult(ResultCode.SUCCESS, "查找News类数据", map);
        System.out.println(jsonResult.toString());
    }
}
