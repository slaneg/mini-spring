package com.cqut.building.service;

import com.cqut.building.entity.ServiceAnswerDetails;

import java.util.List;
import java.util.Map;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_details
 * 作者：王进渝
 * 日期：2019-11-06
 */
public interface ServiceAnswerDetailsService {
    int insert(Map<Integer,ServiceAnswerDetails> serviceAnswerDetailMap);
    List<ServiceAnswerDetails> selectByAnswerRecordId(String id);
}
