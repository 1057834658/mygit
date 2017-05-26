package com.tan.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.tan.test.common.DaoException;
import com.tan.test.dao.AppManagerDao;
import com.tan.test.service.AppManagerService;
import com.tan.test.vo.AppManager;



@Service(value = "appManagerServiceImpl")
public class AppManagerServiceImpl implements AppManagerService{
	
	private static Log logger = LogFactory.getLog(AppManagerServiceImpl.class);
	
	@Resource
	private AppManagerDao appManagerDao;
	
	public Map<String, Object> getNewApp(Integer mobileSysType){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> temMap = new HashMap<String, Object>();
			AppManager appManager;
			try {
				List list = appManagerDao.queryNewApp(mobileSysType);
				if(list != null){
					
					resultMap.put("data",list);
				}
			} catch (DaoException e) {
				e.printStackTrace();
			}
			
		return resultMap;
	}

}
