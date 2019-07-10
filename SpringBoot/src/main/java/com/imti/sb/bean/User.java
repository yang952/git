package com.imti.sb.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Entity
@Table(name = "user")
public class User extends BaseBean {
 
	private long id;
	private String name;
	private String password;
	
	public User() {
		super();
	}

	public User(long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
   
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
 
}

