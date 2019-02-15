package com.activity.test.controller;

import com.activity.test.domain.LResult;
import com.activity.test.domain.Result;
import com.activity.test.dto.Project;
import com.activity.test.dto.SelectDTO;
import com.activity.test.keys.ResultType;
import com.activity.test.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/project")
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/add")
    public Result createProject(@RequestBody String p_name){
        Project project = new Project();
        project.setP_name(p_name);
        try {
            Project p1 = projectService.getProjectByParams(project);
            if(null == p1){
                projectService.addProject(project);
                return new Result(ResultType.SUCCESS,"ok");
            }else {
                return new Result(ResultType.FAIL,"该服务名称已存在");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultType.ERROR,e.getMessage());
        }

    }

    @PostMapping("/del")
    public String removeProject(@RequestBody Integer p_id){
        try {
            projectService.delProject(p_id);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PostMapping("/edit")
    public String editProject(@RequestBody Project project){
        try {
            projectService.editProject(project);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/list")
    public LResult getProjectList(){
        try {
             List<SelectDTO> data = projectService.getProjectList();
             return new LResult(ResultType.SUCCESS,"ok",data);
        } catch (Exception e) {
            e.printStackTrace();
            return new LResult(ResultType.ERROR,e.getMessage());
        }
    }

}
