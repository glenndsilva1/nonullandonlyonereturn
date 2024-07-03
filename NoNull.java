package com.servlet;

import java.util.ArrayList;
import java.util.List;

public class NoNull {
	private List<String> test;
	NoNull(){
		test = new ArrayList<String>();
		test.add("A");
	}
	
	public static void main(String args[]) {
		NoNull nonull = new NoNull();
		System.out.println(nonull.max(0));
	}
	
	public int max(int a) {
		int sizeof;
		if(test.size()==0) {
			sizeof = a;
		}else {
			sizeof = test.size();
		}
		return sizeof;
	}
}
