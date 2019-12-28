package com.icode.interview.basic;

class Student{
	String name;
	String sex;
	static String schoolName;
}

public class TestDemo1 {
	
	private static String name = null;
	static {
		name = "Jim";
	}
	public static void test1() {
		name = "";
	}
	
	private int a = 1;
	public int test() {
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("name --> " + name);
	}
}
