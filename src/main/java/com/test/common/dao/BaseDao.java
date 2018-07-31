package com.test.common.dao;

public interface BaseDao<D,T> {
	/**
	 * 根据id获取一条记录
	 * @param id
	 * @return
	 */
	public T get(String id);
	
	/**
	 * 根据实体获取一条记录
	 * @param model
	 * @return
	 */
	public T get(T model);
	
	/**
	 * 新增方法
	 * @param model
	 */
	public void insert(T model);
	
	/**
	 * 删除方法
	 * @param model
	 */
	public void delete(T model);
	
}
