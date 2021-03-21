package com.cqut.building.service;


import com.cqut.building.entity.ServiceQuestionCategory;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 * 作者：王进渝
 * 日期：2019-11-06
 */
public interface ServiceQuestionCategoryService {
    List<ServiceQuestionCategory> selectAllCategoryName();
}
