package com.activity.test.service;

import com.activity.test.dao.ProjectDao;
import com.activity.test.dto.Project;
import com.activity.test.dto.SelectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<SelectDTO> getProjectList(){

        List<SelectDTO> selectDTOS = new ArrayList<>();
        List<Project> projects= projectDao.searchProjectList();
        for (Project project:projects) {
            selectDTOS.add(new SelectDTO(project.getP_name(),project.getP_name()));
        }
        return selectDTOS;

    }

    public Project getProjectByParams(Project project) {
        return projectDao.searchProjectByParams(project);
    }
}
