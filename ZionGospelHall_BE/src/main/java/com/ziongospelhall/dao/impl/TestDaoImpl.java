package com.ziongospelhall.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ziongospelhall.dao.TestDao;
import com.ziongospelhall.entry.Test;

@Repository
@Transactional
public class TestDaoImpl implements TestDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addTest(Test test) {
		entityManager.persist(test);
	}

}
