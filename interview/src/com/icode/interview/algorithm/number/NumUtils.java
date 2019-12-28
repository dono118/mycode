package com.icode.interview.algorithm.number;

/**
 * 操作数字工具类
 * 
 * @author Jim
 *
 */
public class NumUtils {
	
	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int lDepth = maxDepth(root.left);
		int rDepth = maxDepth(root.right);
		return 1 + (lDepth > rDepth? lDepth:rDepth);
	}
	
	/**
	 * 题目: 从int数组中找出不重复的数字 1,2,4,7,2,7,3,4,1
	 * 思路: 异或思想
	 * 异或的性质: 满足交换律和结合律
	 * 1、a^b = b^a
	 * 2、(a^b)^c = a^(b^c)
	 * 3、a^a = 0, a^0 =a, a^(-1)=~a 
	 * 
	 * @param arr
	 * @return
	 */
	public static int PickSingleNum(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}
		return res;
	}
	
	/**
	 * 反转数字 123 -> 321
	 * 思路: 取余
	 * 
	 * @param x
	 * @return
	 */
	public static int inverse(int x) {
		int result = 0;
		while (x != 0) {
			int mod = x % 10;
			x = x / 10;
			if(result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10)
				return 0;
			result = result * 10 + mod;
		}
		return result;
	}
	
	
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
