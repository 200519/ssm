package com.test.sys.model;

/**
 * person 实体
 * @author Administrator
 *
 */
public class Person {

    private String id;
    private String name;
    private int age;
    private User user;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
