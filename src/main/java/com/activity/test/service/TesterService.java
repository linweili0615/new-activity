package com.activity.test.service;

import com.activity.test.dao.TesterDao;
import com.activity.test.domain.TesterL;
import com.activity.test.dto.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TesterService {
    @Autowired
    private TesterDao testerDao;

    public List<TesterL> getTesterList(){
        List<TesterL> testerLS = new ArrayList<>();
        List<Tester> testers= testerDao.searchTesterList();
        for (Tester tester:testers) {
            testerLS.add(new TesterL(tester.getT_name(),tester.getT_name()));
        }
        return testerLS;
    }
}
