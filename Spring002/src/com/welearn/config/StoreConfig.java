package com.welearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Store getStringStore()
	{
		return new StringStore();
	}

}
