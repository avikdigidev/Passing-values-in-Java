package com.digidev.beans;

public class MySimpleClass {
	private String mySimpleStringName;

	public String getName() {
		return mySimpleStringName;
	}

	public void setName(String name) {
		this.mySimpleStringName = name;
	}

	public MySimpleClass(String name) {
		super();
		this.mySimpleStringName = name;

	}

	public MySimpleClass() {
	}


}
