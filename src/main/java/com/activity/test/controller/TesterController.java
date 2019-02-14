package com.activity.test.controller;

import com.activity.test.dto.Tester;
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
    public List<Tester> getTesterList(){
        return testerService.getTesterList();
    }
}
