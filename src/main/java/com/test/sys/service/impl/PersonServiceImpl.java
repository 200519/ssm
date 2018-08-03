package com.test.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.common.dao.impl.BaseDaoImpl;
import com.test.sys.dao.PersonMapper;
import com.test.sys.model.Person;
import com.test.sys.service.IPersonService;

@Service("personService")
@Transactional(readOnly = true)
public class PersonServiceImpl extends BaseDaoImpl<PersonMapper,Person> implements IPersonService {
    
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }
    
    @Transactional(readOnly = false)
    @Override
    public void insertList(List<Person> list) {
    	for(int i = 0; i < list.size(); i++) {
    		personMapper.insert(list.get(i));
    	}
    }
    
}