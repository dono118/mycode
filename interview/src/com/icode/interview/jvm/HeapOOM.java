package com.icode.interview.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM参数: -Xms1m -Xmx1m
 * 堆溢出 java.lang.OutOfMemoryError: Java heap space
 * 
 * @author Jim
 *
 */
public class HeapOOM {
	static class OOMObject {}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true) {
			list.add(new OOMObject());
		}
	}
}
