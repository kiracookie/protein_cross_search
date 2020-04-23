package org.kiracookie.seau.protein_cross_search.service;

import org.kiracookie.seau.protein_cross_search.bean.Activitydata;
import org.kiracookie.seau.protein_cross_search.dao.ActivitydataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityDataService {
    @Autowired
    ActivitydataDao activitydataDao;
    public List<Activitydata> getActivityData(String searchKey) {
        return activitydataDao.getActivityData(searchKey);
    }

}
