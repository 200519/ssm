package com.test.common.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.apache.log4j.Logger;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.beans.factory.annotation.Autowired;

import com.test.common.dao.BaseDao;
import com.test.common.utils.commonUtil;

public class BaseDaoImpl<D,T> implements BaseDao<D,T>{
	private Logger logger = Logger.getLogger(BaseDaoImpl.class);

	@Autowired  
    private SqlSessionTemplate sqlSession;  

	protected Class<D> entityClass;
	protected String sqlMapNamespace;
	
	public static final String COMMON_SELECT = ".select";
	public static final String COMMON_INSERT = ".insert";
	public static final String COMMON_DELETE = ".delete"; 

	public String getSqlMapNamespace() {
		return sqlMapNamespace;
	}
	
	protected SqlSessionTemplate getSqlSession(){
		return sqlSession;
	}
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {	
		entityClass = commonUtil.getSuperClassGenricType(getClass());
		sqlMapNamespace = entityClass.getName();
		logger.debug("entityClass="+entityClass+",sqlMapNamespace="+sqlMapNamespace);
	}
	
	@Override
	public T get(String id) {
		if(id ==null ) return null;
		return sqlSession.selectOne(sqlMapNamespace+COMMON_SELECT,id);
	}
	
	@Override 
	public T get(T model) {
		System.out.println("sql2:"+sqlMapNamespace);
		return sqlSession.selectOne(sqlMapNamespace+COMMON_SELECT,model);
	}
	
	@Override
	public void insert(T model) {
		sqlSession.insert(sqlMapNamespace+COMMON_INSERT, model);
	}
	
	@Override
	public void delete(T model) {
		sqlSession.delete(sqlMapNamespace+COMMON_DELETE, model);
	}
}
