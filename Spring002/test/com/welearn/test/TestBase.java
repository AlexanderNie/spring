package com.welearn.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBase {
	
	private String beanPath;
	;private ClassPathXmlApplicationContext ctx;
	
	
	public TestBase(String beanPath) {
		super();
		this.beanPath = beanPath;
	}
	
	public <T extends Object> T getBean(String beanId)
	{
		return (T) ctx.getBean(beanId);
	}

	@Before
	public void init()
	{
		ctx = new ClassPathXmlApplicationContext(beanPath);
		ctx.start();
	}
	
	@After
	public void clean()
	{
		ctx.destroy();
	}
	
	

}
