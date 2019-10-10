package com.example.quartz.service;


import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {
	public PageInfo getJobAndTriggerDetails(int pageNum, int pageSize);
}
