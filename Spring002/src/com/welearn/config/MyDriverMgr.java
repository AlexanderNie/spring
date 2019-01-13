package com.welearn.config;

public class MyDriverMgr {
	private String url;
	private String password;
	private String username;
	
	public MyDriverMgr(String url, String password, String username) {
		super();
		this.url = url;
		this.password = password;
		this.username = username;
	}

	@Override
	public String toString() {
		return "MyDriverMgr [url=" + url + ", password=" + password + ", username=" + username + "]";
	}
	
}
