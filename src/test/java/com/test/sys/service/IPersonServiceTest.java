package com.test.sys.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sys.model.Person;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml","classpath:mybatis-spring.xml","classpath:mybatis-config.xml","classpath:ApplicationContext.xml"})
public class IPersonServiceTest {
	
	@Autowired
	private IPersonService personService;
	
	/*@SuppressWarnings("resource")
	@BeforeClass
    public static void init() {//junit之前init spring
        ApplicationContext   context = new ClassPathXmlApplicationContext("classpath*:spring.xml");//这里路径之前没有配对于是一直出错
        personService = (IPersonService)context.getBean("personService");
    }*/
	
	@Test
	public void test() {
		/*List<Person> list = new ArrayList<Person>();
		
		Person per = new Person();
		per.setAge(23);
		per.setName("cjen");
		per.setId("222222");
		list.add(per);
		
		Person per2 = new Person();
		per.setAge(13);
		per.setName("sadsa");
		per.setId("3213213");
		list.add(per2);
		
		personService.insert(per);*/
		try {
			Person person = personService.get("1");
			System.out.println(person.getName());
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
}
