package com.test.sys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.sys.model.Person;
import com.test.sys.model.User;
import com.test.sys.service.IPersonService;



@Controller
@RequestMapping("/personController")
public class PersonController {
    
    private IPersonService personService;
    
    public IPersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        return "showperson";
    }
    
    
    @RequestMapping("/personDetail")
    public String personDetail(@ModelAttribute Person person,Model model) {  
    	person = personService.get(person);
    	model.addAttribute("person", person);
    	return "personDetail";
    }
}