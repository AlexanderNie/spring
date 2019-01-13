package com.welearn.listinterface;

import org.springframework.stereotype.Component;

@Component("inuse")
public class InterfaceImpl1 implements OneInterface {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("class name" +  getClass().getName());
	}

}
