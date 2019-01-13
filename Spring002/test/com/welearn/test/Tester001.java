package com.welearn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.welearn.business.MovieService;
import com.welearn.business.MyService;
import com.welearn.config.MyDriverMgr;
import com.welearn.config.Store;
import com.welearn.config.StoreConfig;
import com.welearn.config.StringStore;
import com.welearn.jsr.JsrService;
import com.welearn.listinterface.BeanInvoker;

@RunWith(BlockJUnit4ClassRunner.class)
public class Tester001 extends TestBase {
	
	public Tester001() {
		// TODO Auto-generated constructor stub
		super("classpath:beans001.xml");
	}
	
	
	
	@Test
	public void testResource()
	{
		MyService service = super.getBean("myService");
		service.save();
	}
	
	@Test
	public void testFindMovie()
	{
		MovieService service  = super.getBean("movieService");
		service.find();
	}
	
	@Test
	public void testListInterface()
	{
		BeanInvoker beanInvoker =  super.getBean("beanInvoker");
		beanInvoker.showBeans();
	}

	@Test
	public void testStore()
	{
		Store store =  super.getBean("getStringStore");
		System.out.println("store instance " +  store.getClass().getName());
	}
	
	
	@Test
	public void testMyDriverMgr()
	{
		MyDriverMgr mgr =  super.getBean("myDriverMgr");
		System.out.println("driver mgr " +  mgr.toString());
	}
	
	@Test
	public void testGeneric()
	{
		super.getBean("testStore");
		
	}
	
	@Test
	public void testJsr()
	{
		JsrService service = super.getBean("jsrService");
		service.save();
		
	}
}
