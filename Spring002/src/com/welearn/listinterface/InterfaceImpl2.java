package com.welearn.listinterface;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl2 implements OneInterface {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hash code " + hashCode());
	}

}
