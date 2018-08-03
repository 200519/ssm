package com.test.common.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.test.common.dao.impl.BaseDaoImpl;
import com.test.common.service.BaseService;

@Transactional(readOnly = true)
public class BaseServiceImpl<D,T> extends BaseDaoImpl<D, T> implements BaseService<D, T>{
	
}
