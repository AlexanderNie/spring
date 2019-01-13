package com.welearn.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	private MovieFinder finder;
	
	public void find()
	{
		System.out.println("find service start");
		finder.find();
	}
}
