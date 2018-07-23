package com.test.model;

/**
 * user实体类
 * @author user
 *
 */
public class User {
	private String id;
	private String username;
	private String password;
	private Person person;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "User[username：]"+username;
		
	}
}
