package com.activity.test.controller;

import com.activity.test.domain.LResult;
import com.activity.test.dto.SelectDTO;
import com.activity.test.keys.ResultType;
import com.activity.test.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/tester")
@RestController
public class TesterController {
    @Autowired
    private TesterService testerService;

    @GetMapping("/list")
    public LResult getTesterList(){

        try {
            List<SelectDTO> data = testerService.getTesterList();
            return new LResult(ResultType.SUCCESS,"ok",data);
        } catch (Exception e) {
            e.printStackTrace();
            return new LResult(ResultType.ERROR,e.getMessage());
        }
    }
}
