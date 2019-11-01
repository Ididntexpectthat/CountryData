package com.ydl.api;

import com.ydl.entity.EconomicData;
import com.ydl.service.EconomicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("EconomicData")
public class EconomicDataApi {
    @Autowired
    EconomicDataService economicDataService;
    @PostMapping("/classification")
    public Object getAllDepartment(@RequestBody EconomicData economicData) {
        return new ResponseEntity<List>(economicDataService.getAllTableName(economicData), HttpStatus.OK);
    }
}
