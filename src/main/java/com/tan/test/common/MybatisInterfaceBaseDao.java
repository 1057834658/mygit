package com.tan.test.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface MybatisInterfaceBaseDao<T> {
	public abstract int insert(String paramString) throws DaoException;

	public abstract int insert(String paramString, Object paramObject)
			throws DaoException;

	public abstract int delete(String paramString) throws DaoException;

	public abstract int delete(String paramString, Object paramObject)
			throws DaoException;

	public abstract int deleteById(String paramString,
			Serializable paramSerializable) throws DaoException;

	public abstract int update(String paramString) throws DaoException;

	public abstract int update(String paramString, Object paramObject)
			throws DaoException;

	public abstract int updateById(String paramString,
			Serializable paramSerializable) throws DaoException;

	public abstract T get(String paramString) throws DaoException;

	public abstract T get(String paramString, Serializable paramSerializable)
			throws DaoException;

	public abstract T get(String paramString, Object paramObject)
			throws DaoException;

	public abstract T get(String paramString, Map<String, Object> paramMap)
			throws DaoException;

	public abstract Object getObject(String paramString, Object paramObject)
			throws DaoException;

	public abstract Object getObject(String paramString,
			Map<String, Object> paramMap) throws DaoException;

	public abstract List<T> query(String paramString) throws DaoException;

	public abstract List<T> query(String paramString, Object paramObject)
			throws DaoException;

	public abstract List<T> query(String paramString,
			Map<String, Object> paramMap) throws DaoException;

	public abstract List<Object> queryObject(String paramString,
			Object paramObject) throws DaoException;

	public abstract List<Object> queryObject(String paramString,
			Map<String, Object> paramMap) throws DaoException;

	public abstract int queryCount(String paramString) throws DaoException;

	public abstract int queryCount(String paramString, Object paramObject)
			throws DaoException;

	public abstract int queryCount(String paramString,
			Map<String, Object> paramMap) throws DaoException;
}
