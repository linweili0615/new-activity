package com.activity.test.controller;

import com.activity.test.dto.Project;
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
    public String createProject(@RequestBody String p_name){
        Project project = new Project();
        project.setP_name(p_name);
        try {
            projectService.addProject(project);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
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
    public List<Project> getProjectList(){
        try {
            return projectService.getProjectList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
