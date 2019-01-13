package com.welearn.mygeneric;

public class String1Store implements Store<String> {

	@Override
	public void sayType(String object) {
		// TODO Auto-generated method stub
		System.out.println("String Class " +  object.hashCode());
	}

	
}
