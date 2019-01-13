package com.welearn.jsr;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService {
	@Resource
	private JsrDao dao;
	public void save()
	{
		System.out.println("service start");
		dao.save();
	}
}
