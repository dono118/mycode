package com.icode.interview.jvm;

/**
 * JVM栈溢出 java.lang.StackOverflowError
 * 
 * @author Jim
 *
 */
public class JavaStackSOF {
	private int statckLength = 1;
	public void stackLeak() {
		statckLength++;
		stackLeak();
	}
	public static void main(String[] args) {
		JavaStackSOF oom = new JavaStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("Stack length: " + oom.statckLength);
			throw e;
		}
	}
}
