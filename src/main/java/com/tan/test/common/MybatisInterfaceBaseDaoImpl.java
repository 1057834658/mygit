package com.tan.test.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MybatisInterfaceBaseDaoImpl<T> implements
MybatisInterfaceBaseDao<T> {
	static{
		System.out.println("222222222");
	}
	private static Logger logger = LogManager
			.getLogger(MybatisInterfaceBaseDaoImpl.class.getName());
	private static SqlSessionFactory sqlSessionFactory;

	static {
		sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
	
	public SqlSessionFactory getSqlSessionFactory() {
		return this.sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public int insert(String sqlMapId) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.insert(sqlMapId);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int insert(String sqlMapId, Object o) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.insert(sqlMapId, o);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int delete(String sqlMapId) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.delete(sqlMapId);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int delete(String sqlMapId, Object o) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.delete(sqlMapId, o);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int deleteById(String sqlMapId, Serializable id) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.delete(sqlMapId, id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int update(String sqlMapId) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.update(sqlMapId);
			session.commit();
		} catch (Exception e) {
			logger.debug(e);
			session.rollback();
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int update(String sqlMapId, Object o) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.update(sqlMapId, o);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int updateById(String sqlMapId, Serializable id) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = session.update(sqlMapId, id);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public T get(String sqlMapId) throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object t = session.selectOne(sqlMapId);
			return (T) t;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public T get(String sqlMapId, Serializable id) throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object t = session.selectOne(sqlMapId, id);
			return (T) t;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public T get(String sqlMapId, Object paramObject) throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object t = session.selectOne(sqlMapId, paramObject);
			return (T) t;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public T get(String sqlMapId, Map<String, Object> paramMap)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object t = session.selectOne(sqlMapId, paramMap);
			return (T) t;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public Object getObject(String sqlMapId, Object paramObject)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object object = session.selectOne(sqlMapId, paramObject);
			return object;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public Object getObject(String sqlMapId, Map<String, Object> paramMap)
			throws DaoException {
		System.out.println("3333333333");
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			Object object = session.selectOne(sqlMapId, paramMap);
			return object;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public List<T> query(String sqlMapId) throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			List list = session.selectList(sqlMapId);
			return list;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public List<T> query(String sqlMapId, Object paramObject)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			List list = session.selectList(sqlMapId, paramObject);
			return list;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public List<T> query(String sqlMapId, Map<String, Object> paramMap)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			List list = session.selectList(sqlMapId, paramMap);
			return list;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public List<Object> queryObject(String sqlMapId, Object paramObject)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			List list = session.selectList(sqlMapId, paramObject);
			return list;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public List<Object> queryObject(String sqlMapId,
			Map<String, Object> paramMap) throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			List list = session.selectList(sqlMapId, paramMap);
			return list;
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
	}

	public int queryCount(String sqlMapId) throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = ((Integer) session.selectOne(sqlMapId)).intValue();
		} catch (Exception e) {
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int queryCount(String sqlMapId, Object paramObject)
			throws DaoException {
		int num = 0;
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		try {
			num = ((Integer) session.selectOne(sqlMapId, paramObject))
					.intValue();
		} catch (Exception e) {
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}

	public int queryCount(String sqlMapId, Map<String, Object> paramMap)
			throws DaoException {
		SqlSession session = MybatisUtil.getSqlSession(this.sqlSessionFactory);
		int num = 0;
		try {
			num = ((Integer) session.selectOne(sqlMapId, paramMap)).intValue();
		} catch (Exception e) {
			logger.debug(e);
			throw new DaoException(e.getMessage());
		} finally {
			MybatisUtil.closeSession(session);
		}
		return num;
	}
}
