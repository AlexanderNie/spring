package com.welearn.mygeneric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {
	
	@Autowired
	private Store<Integer> store1;
	
	@Autowired
	private Store<String> store2;

	@Bean(name = "store1")
	public IntegerStore getStore1() {
		return new IntegerStore();
	}

	@Bean(name = "store2")
	public String1Store getStore2() {
		return new String1Store();
	}
	
	@Bean(name = "testStore")
	public StoreConfig testStore()
	{
		store1.sayType(1);
		store2.sayType("abc");
		return new StoreConfig();
	}
}
