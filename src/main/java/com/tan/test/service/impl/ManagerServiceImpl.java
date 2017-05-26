package com.tan.test.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tan.test.common.DaoException;
import com.tan.test.dao.AppManagerDao;
import com.tan.test.service.ManagerService;
import com.tan.test.vo.AppManager;



@Service("managerServiceImpl")
public class ManagerServiceImpl implements ManagerService{
	
	 private static Logger logger = LoggerFactory.getLogger(ManagerServiceImpl.class);
	
	@Resource
	private AppManagerDao appManagerDao;
	
	public Map<String, Object> getNewApp(Integer mobileSysType) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> temMap = new HashMap<String, Object>();
			AppManager appManager;
							try {
								List  list= appManagerDao.queryNewApp(mobileSysType);
								
								if(list != null){
//									logger.info("**************************1111111");
									logger.debug("**************************222222");
									resultMap.put("data",list);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								resultMap.put("status",0);
								throw e;
							}
//							SqlSessionFactory sqlSessionFactory;
//							String resource = "spring/sqlMapConfig.xml";
//					        Reader reader = null;
//					        InputStream inputStream=null;
//					        try {
//					        	System.out.println("132");
//					        	//将配置文件加载成流  
//					            inputStream = Resources.getResourceAsStream(resource);  
//					        } catch (IOException e) {
//					        	System.out.println("456");
//					            System.out.println(e.getMessage());
//					        }
//					        System.out.println("789");
//					        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//					        System.out.println("147");
//							
//							SqlSession sqlSession=sqlSessionFactory.openSession();
//							System.out.println("258");
//							Object object = sqlSession.selectOne("com.tan.test.dao.AppManagerDao.queryMaxNowApp", null);
//							System.out.println(object);
//							appManager=(AppManager)object;
//							
							
			
		return resultMap;
	}
	
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory;
		String resource = "spring/sqlMapConfig.xml";
        Reader reader = null;
        InputStream inputStream=null;
        try {
        	System.out.println("132");
        	//将配置文件加载成流  
            inputStream = Resources.getResourceAsStream(resource);  
        } catch (IOException e) {
        	System.out.println("456");
            System.out.println(e.getMessage());
        }
        System.out.println("789");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println("147");
		
		SqlSession sqlSession=sqlSessionFactory.openSession();
		System.out.println("258");
		Object object = sqlSession.selectOne("com.tan.test.dao.AppManagerDao.queryMaxNowApp", null);
		System.out.println(object);
	}

	public List getNewAppjsp(Map<String, Object> dataMap) {
		AppManager appManager;
		List  list=new ArrayList();
		try {
			list= appManagerDao.queryNewApp(1);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("**************************222222");
//			logger.debug("**************************1111111");
		return list;
	}

}
