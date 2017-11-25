package com.ziongospelhall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ziongospelhall.dao.TestDao;
import com.ziongospelhall.entry.Test;
import com.ziongospelhall.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public void test(Test test) {
		testDao.addTest(test);
	}

}
