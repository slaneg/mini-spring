package com.cqut.building.dao;


import com.cqut.building.entity.ServiceLeaveWords;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ServiceLeaveWordsMapper {


	int deleteByPrimaryKey(String id);


	int insert(ServiceLeaveWords record);


	int insertSelective(ServiceLeaveWords record);


	ServiceLeaveWords selectByPrimaryKey(String id);


	int updateByPrimaryKeySelective(ServiceLeaveWords record);


	int updateByPrimaryKey(ServiceLeaveWords record);
}