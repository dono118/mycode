package com.icode.interview.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM参数: -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 * 运行时常量池溢出 jjava.lang.OutOfMemoryError: GC overhead limit exceeded
 * 
 * @author Jim
 *
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
