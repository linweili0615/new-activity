package com.activity.test.service;

import com.activity.test.dao.TesterDao;
import com.activity.test.dto.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesterService {
    @Autowired
    private TesterDao testerDao;

    public List<Tester> getTesterList(){
        return testerDao.searchTesterList();
    }
}
