package com.cqut.building.entity;

import java.util.Date;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 * 作者：王进渝
 * 日期：2019-11-06
 */
public class ServiceQuestionCategory {
    private String id;

    private String categoryName;

    private String remark;

    private String founderId;

    private Date creationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFounderId() {
        return founderId;
    }

    public void setFounderId(String founderId) {
        this.founderId = founderId == null ? null : founderId.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTion) {
        this.creationTime = creationTion;
    }
}