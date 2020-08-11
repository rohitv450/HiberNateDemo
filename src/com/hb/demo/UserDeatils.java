package com.hb.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="mydemo")
public class UserDeatils {
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}							

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}