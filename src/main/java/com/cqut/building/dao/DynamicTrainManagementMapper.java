package com.cqut.building.dao;

import com.cqut.building.dto.GetDynamicTrainManagementDto;
import com.cqut.building.entity.DynamicTrainManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 小程序>>>>首页>>>党校培训
 * 对应表：dynamic_train_management
 * 作者：王进渝
 * 日期：2019-11-06
 */

@Mapper
public interface DynamicTrainManagementMapper {
    int deleteByPrimaryKey(String id);

    int insert(DynamicTrainManagement record);

    int insertSelective(DynamicTrainManagement record);

    GetDynamicTrainManagementDto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DynamicTrainManagement record);

    int updateByPrimaryKeyWithBLOBs(DynamicTrainManagement record);

    int updateByPrimaryKey(DynamicTrainManagement record);

    List<GetDynamicTrainManagementDto> selectTrainAll();

    int updateBrowsingByPrimaryKey(String id);

    int updatePraiseByPrimaryKeyAdd(String id);

    int updatePraiseByPrimaryKeyReduce(String id);
}