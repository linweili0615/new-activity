package com.activity.test.controller;

import com.activity.test.domain.LResult;
import com.activity.test.domain.Page;
import com.activity.test.domain.ProjectExtendResult;
import com.activity.test.domain.Result;
import com.activity.test.dto.ProjectExtend;
import com.activity.test.keys.ResultType;
import com.activity.test.service.ProjectExtendService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/project/extend")
@RestController
public class ProjectExtendController {

    @Autowired
    private ProjectExtendService projectExtendService;

    @PostMapping("/add")
    public Result createProject(@RequestBody ProjectExtend projectExtend){
        try {
            projectExtendService.addProjectExtend(projectExtend);
            return new Result(ResultType.SUCCESS,"ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultType.ERROR,e.getMessage());
        }

    }

    @PostMapping("/del")
    public Result removeProject(@RequestBody Integer e_id){
        try {
            projectExtendService.delProjectExtend(e_id);
            return new Result(ResultType.SUCCESS,"ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultType.ERROR,e.getMessage());
        }
    }

    @PostMapping("/edit")
    public Result editProject(@RequestBody ProjectExtend projectExtend){
        try {
            projectExtendService.editProjectExtend(projectExtend);
            return new Result(ResultType.SUCCESS,"OK");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultType.ERROR,e.getMessage());
        }
    }

    @PostMapping("/list")
    public ProjectExtendResult getProjectList(@RequestBody Page page){
        try {
            Integer pageSize = page.getPageSize();
            Integer pageNo = page.getPageNo();
            if(null == pageSize){
                pageSize = 15;
            }
            if(null == pageNo){
                pageNo = 1;
            }
            PageHelper.startPage(pageNo,pageSize);
            List<ProjectExtend> data =  projectExtendService.getProjectExtendList();
            PageInfo<ProjectExtend> pageInfo = new PageInfo<>(data);
            int row_count = (int) pageInfo.getTotal();
            int pageCount = row_count % pageSize==0 ? row_count/pageSize : row_count/pageSize + 1;
            return new ProjectExtendResult(ResultType.SUCCESS,"ok",data,pageInfo.getTotal(),pageCount,pageSize,pageNo);
        } catch (Exception e) {
            e.printStackTrace();
            return new ProjectExtendResult(ResultType.ERROR,e.getMessage());
        }
    }

    @PostMapping("/info")
    public Result getProjectList(@RequestBody Integer e_id){
        try {
            ProjectExtend data =  projectExtendService.searchProjectExtendById(e_id);
            return new Result(ResultType.SUCCESS,"ok",data);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultType.ERROR,e.getMessage());
        }
    }

}
