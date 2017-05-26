package com.tan.test.dao;

import java.util.List;

import com.tan.test.common.DaoException;
import com.tan.test.vo.AppManager;


/**
 * 
 * @Project: schollmallsuper2.0
 * @ClassName: AppManagerDao
 * @Description: app管理
 * @Author:	田超
 * @Date:	日期：2016年8月17日  时间：下午5:56:55
 * @Version 1.0.0
 */
public interface AppManagerDao{
	
	public List queryNewApp(Integer mobileSysType) throws DaoException;
}
