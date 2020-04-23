package org.kiracookie.seau.protein_cross_search.dao;

import org.kiracookie.seau.protein_cross_search.bean.Activitydata;

import java.util.List;

public interface ActivitydataDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Activitydata record);

    int insertSelective(Activitydata record);

    Activitydata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activitydata record);

    int updateByPrimaryKey(Activitydata record);

    List<Activitydata> getActivityData(String searchKey);
}