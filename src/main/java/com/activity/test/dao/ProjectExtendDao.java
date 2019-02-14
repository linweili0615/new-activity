package com.activity.test.dao;

import com.activity.test.dto.ProjectExtend;

import java.util.List;

public interface ProjectExtendDao {
    Integer insertProjectExtend(ProjectExtend projectExtend);
    Integer deleteProjectExtend(Integer e_id);
    Integer modifyProjectExtend(ProjectExtend projectExtend);
    ProjectExtend searchProjectExtendById(Integer e_id);
    List<ProjectExtend> searchProjectExtendList();
}
