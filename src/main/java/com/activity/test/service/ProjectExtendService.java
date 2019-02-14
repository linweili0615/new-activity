package com.activity.test.service;

import com.activity.test.dao.ProjectExtendDao;
import com.activity.test.dto.ProjectExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectExtendService {
    @Autowired
    private ProjectExtendDao extendDao;

    public Integer addProjectExtend(ProjectExtend projectExtend){
        return extendDao.insertProjectExtend(projectExtend);
    }

    public Integer delProjectExtend(Integer e_id){
        return extendDao.deleteProjectExtend(e_id);
    }

    public Integer editProjectExtend(ProjectExtend projectExtend){
        return extendDao.modifyProjectExtend(projectExtend);
    }

    public ProjectExtend searchProjectExtendById(Integer e_id){
        return extendDao.searchProjectExtendById(e_id);
    }
    public List<ProjectExtend> getProjectExtendList(){
        return extendDao.searchProjectExtendList();
    }
}
