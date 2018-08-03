package com.test.sys.dao;

import java.util.List;

import com.test.common.dao.BaseDao;
import com.test.sys.model.Person;

public interface PersonMapper extends BaseDao<PersonMapper,Person>{  
    /**
     * 查询所有
     * @return
     */
    List<Person> queryAll();
    
}