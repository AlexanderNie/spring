package com.welearn.mygeneric;

public class IntegerStore implements Store<Integer> {

	@Override
	public void sayType(Integer object) {
		// TODO Auto-generated method stub
		System.out.println("Int Class " +  object.hashCode());
	}

}
