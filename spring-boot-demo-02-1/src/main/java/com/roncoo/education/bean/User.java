/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.bean;

import com.roncoo.education.annotations.NeedTest;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date date;

	@NeedTest
	public int getId() {
		return id;
	}

	@NeedTest(value = false)
	public void setId(int id) {
		this.id = id;
	}

	@NeedTest
	public String getName() {
		return name;
	}

	@NeedTest
	public void setName(String name) {
		this.name = name;
	}

	@NeedTest
	public Date getDate() {
		return date;
	}

	@NeedTest
	public void setDate(Date date) {
		this.date = date;
	}
}
