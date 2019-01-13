package com.welearn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/welearn/config/config.xml")
public class DriverConfig {
	@Value("${connection.url}")
	private String url;
	
	@Value("${connection.password}")
	private String password;
	
	@Value("${connection.username}")
	private String username;
	
	@Bean(name = "myDriverMgr")
	public MyDriverMgr getMyDriverMgr()
	{
		return new MyDriverMgr(url, password, username);
	}
}
