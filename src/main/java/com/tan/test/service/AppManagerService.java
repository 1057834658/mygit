package com.tan.test.service;

import java.util.Map;

public interface AppManagerService {
	
	/**
	 * 
	* @Title: getNewApp 
	* @Author: 田超
	* @Date:日期：2016年8月19日  时间：下午6:01:25
	* @Description: 获得最新版本的app
	* @param request
	* @return
	* @throws ServiceException
	* @return Map<String,Object>
	* @Version 1.0.0
	 */
	public Map<String, Object> getNewApp(Integer mobileSysType);
}
