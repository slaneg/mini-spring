package com.cqut.building.serviceImp;


import com.cqut.building.dao.ServiceQuestionCategoryMapper;
import com.cqut.building.entity.ServiceQuestionCategory;
import com.cqut.building.service.ServiceQuestionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 * 作者：王进渝
 * 日期：2019-11-06
 */
@Service
public class ServiceQuestionCategoryServiceImp implements ServiceQuestionCategoryService {
    @Autowired(required = false)
    ServiceQuestionCategoryMapper serviceQuestionCategoryMapper;
    @Override
    public List<ServiceQuestionCategory> selectAllCategoryName() {
        return serviceQuestionCategoryMapper.selectAllCategoryName();
    }
}
