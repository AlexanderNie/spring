package com.welearn.config;

public class StringStore implements Store {
	public void init()
	{
		System.out.println("init string store");
	}
	
	public void destroy()
	{
		System.out.println("clean string store");
	}

}
