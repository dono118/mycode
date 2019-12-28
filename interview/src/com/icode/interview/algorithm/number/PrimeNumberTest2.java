package com.icode.interview.algorithm.number;

/**
 * 100000以内的所有质数的输出,实现方式二
 */
public class PrimeNumberTest2 {

	public static void main(String[] args) {
		int count = 0;//记录质数个数
		long start = System.currentTimeMillis();

		label:for (int i = 2; i <= 100000; i++) {//遍历100000以内的自然数
			
			// 优化二:对质数有效
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i % j == 0) {
					continue label;
				}
			}

			count++;
		}

		long end = System.currentTimeMillis();

		System.out.println("质数个数: " + count);
		System.out.println("所用时间: " + (end - start));
	}
}