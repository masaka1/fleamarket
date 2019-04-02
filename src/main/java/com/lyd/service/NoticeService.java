package com.lyd.service;

import java.util.List;

import com.lyd.pojo.Notice;

public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);
	
	



}
