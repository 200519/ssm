package com.test.sys.service;

import java.util.List;
import com.test.common.service.BaseService;
import com.test.sys.dao.PersonMapper;
import com.test.sys.model.Person;

public interface IPersonService extends BaseService<PersonMapper,Person>{

    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}