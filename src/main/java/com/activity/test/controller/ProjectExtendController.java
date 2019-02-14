package com.activity.test.controller;

import com.activity.test.domain.LResult;
import com.activity.test.dto.ProjectExtend;
import com.activity.test.keys.ResultType;
import com.activity.test.service.ProjectExtendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/project/extend")
@RestController
public class ProjectExtendController {

    @Autowired
    private ProjectExtendService projectExtendService;

    @PostMapping("/add")
    public String createProject(@RequestBody ProjectExtend projectExtend){
        try {
            projectExtendService.addProjectExtend(projectExtend);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

    @PostMapping("/del")
    public String removeProject(@RequestBody Integer e_id){
        try {
            projectExtendService.delProjectExtend(e_id);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PostMapping("/edit")
    public String editProject(@RequestBody ProjectExtend projectExtend){
        try {
            projectExtendService.editProjectExtend(projectExtend);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/list")
    public LResult getProjectList(){
        try {
            List<ProjectExtend> data =  projectExtendService.getProjectExtendList();
            return new LResult(ResultType.SUCCESS,"ok",data);
        } catch (Exception e) {
            e.printStackTrace();
            return new LResult(ResultType.ERROR,e.getMessage());
        }
    }

    @PostMapping("/info")
    public ProjectExtend getProjectList(@RequestBody Integer e_id){
        try {
            return projectExtendService.searchProjectExtendById(e_id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
