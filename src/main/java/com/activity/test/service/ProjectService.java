package com.activity.test.service;

import com.activity.test.dao.ProjectDao;
import com.activity.test.dto.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public Integer addProject(Project project){
        return projectDao.insertProject(project);
    }

    public Integer delProject(Integer p_id){
        return projectDao.deleteProject(p_id);
    }

    public Integer editProject(Project project){
        return projectDao.modifyProject(project);
    }

    public List<Project> getProjectList(){
        return projectDao.searchProjectList();
    }
}
