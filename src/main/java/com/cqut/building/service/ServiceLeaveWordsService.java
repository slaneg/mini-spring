package com.cqut.building.service;

import com.cqut.building.entity.ServiceLeaveWords;

public interface ServiceLeaveWordsService {
    int deleteByPrimaryKey(String id);


    int insert(ServiceLeaveWords record);


    ServiceLeaveWords selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(ServiceLeaveWords record);


    int updateByPrimaryKey(ServiceLeaveWords record);
}
