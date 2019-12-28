package com.icode.interview.algorithm.number;

/**
 *打印出1000以内的所有完数
 *完数，一般指完全数，一个自然数如果它的所有真因子（即除了自身以外的约数）的和等于该数，那么这个数就是完全数，
  如:6的真因子有1 、2、3，6=1+2+3，所以6是一个完全数。
 *
 */
public class PerfectNumberTest {

	public static void main(String[] args) {
		
		int factor = 0;
		for (int i = 1; i <= 1000; i++) {

			for (int j = 1; j <= i/2; j++) {

				if (i % j == 0) {
					factor += j;
				}
			}

			if (i == factor) {
				System.out.println(i);
			}
			// 重置factor
			factor = 0;
		}
	}
}