package com.activity.test.dao;

import com.activity.test.dto.Project;

import java.util.List;

public interface ProjectDao {
    Integer insertProject(Project project);
    Integer deleteProject(Integer p_id);
    Integer modifyProject(Project project);
    List<Project> searchProjectList();
}
