/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.roncoo.education.bean;

import com.roncoo.education.annotations.NeedTest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;
@Aspect
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("how are you");
    }

}
