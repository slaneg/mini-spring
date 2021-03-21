package com.cqut.building.service;

import com.cqut.building.dao.SysAnnouncementMapper;
import com.cqut.building.entity.SysAnnouncement;

import java.util.List;

/**
 * 小程序>>>消息通知>>>>系统公告
 * 对应表：sys_announcement
 * 作者：王进渝
 * 日期：2019-12-20
 */
public interface SysAnnouncementService {
    List<String> selectAllScope();
    List<SysAnnouncement> selectAnnouncementByUser(String notificationScopes);
    SysAnnouncement selectByPrimaryKey(String id);
}
