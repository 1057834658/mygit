package com.tan.test.common;

import javax.annotation.Resource;

public abstract class AbstractMybatisBaseDao<T> {

	@Resource(name = "mybatisInterfaceBaseDao")
	public MybatisInterfaceBaseDao<T> mybatisInterfaceBaseDao;

	public MybatisInterfaceBaseDao<T> getMybatisInterfaceBaseDao() {
		return this.mybatisInterfaceBaseDao;
	}
}
