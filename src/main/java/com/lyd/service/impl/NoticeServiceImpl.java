package com.lyd.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.lyd.dao.NoticeMapper;
import com.lyd.pojo.Notice;
import com.lyd.service.NoticeService;

@Service("NoticeService")
public class NoticeServiceImpl implements NoticeService{
	 @Resource
	 private NoticeMapper noticeMapper;

	@Override
	public List<Notice> getNoticeList() {
		
		return noticeMapper.getNoticeList();
	}

	@Override
	public void insertSelective(Notice notice) {
		noticeMapper.insertSelective(notice);
		
	}




}
