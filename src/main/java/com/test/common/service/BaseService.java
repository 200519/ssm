package com.test.common.service;

/**
 * 
 * @author user
 *
 * @param <T>
 */
public interface BaseService<D,T>{
	
	public T get(String id);
	
	
	public T get(T model);
	
	
	public void insert(T model);
	
	
	public void delete(T model);
}
