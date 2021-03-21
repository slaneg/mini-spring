package com.cqut.building.service;

import com.cqut.building.dto.GetExaminationManagementByIdDto;
import com.cqut.building.dto.GetServiceExaminationManagementDto;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 * 作者：王进渝
 * 日期：2019-11-06
 */
public interface ServiceExaminationManagementService {
    List<GetServiceExaminationManagementDto> selectExaminationAll(String userId);
    List<GetServiceExaminationManagementDto> selectExaminationByCategory(String userId,String questionCategoryId);
    GetExaminationManagementByIdDto selectExaminationById(String userId, String id);
}
