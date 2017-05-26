package com.tan.test.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MybatisUtil {
	private static Logger logger = LogManager.getLogger(MybatisUtil.class
			.getName());

	private final static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "spring/spring.xml";
        Reader reader = null;
        InputStream inputStream=null;
        try {
        	//将配置文件加载成流  
            inputStream = Resources.getResourceAsStream(resource);  
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
	    
	public static SqlSessionFactory getSqlSessionFactory(
			SqlSessionFactory sqlSessionFactory) throws DaoException {
		if (sqlSessionFactory != null) {
			return sqlSessionFactory;
		}
		logger.debug("sqlSessionFactory is null");
		throw new DaoException("sqlSessionFactory is null");
	}

	public static SqlSession getSqlSession(SqlSessionFactory sqlSessionFactory)
			throws DaoException {
		if (sqlSessionFactory != null) {
			return sqlSessionFactory.openSession();
		}
		logger.debug("sqlSessionFactory is null");
		throw new DaoException("sqlSessionFactory is null");
	}

	public static void closeSession(SqlSession session) throws DaoException {
		if (session != null) {
			session.close();
		} else {
			logger.debug("sqlSession is null");
			throw new DaoException("sqlSession is null");
		}
	}
}
