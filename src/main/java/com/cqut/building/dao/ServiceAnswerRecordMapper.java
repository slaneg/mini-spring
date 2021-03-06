package com.cqut.building.dao;

import com.cqut.building.entity.ServiceAnswerRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_record
 * 作者：王进渝
 * 日期：2019-11-06
 */

@Mapper
public interface ServiceAnswerRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceAnswerRecord record);

    int insertSelective(ServiceAnswerRecord record);

    ServiceAnswerRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceAnswerRecord record);

    int updateByPrimaryKey(ServiceAnswerRecord record);
}