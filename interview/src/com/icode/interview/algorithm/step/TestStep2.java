package com.icode.interview.algorithm.step;

import org.junit.Test;

/**
 * 有n步台阶,一次只能上1步或2步,共有多少种走法?
 * 循环迭代:
 *  优点: 消耗内存小,效率高
 *  缺点: 代码复杂,可读性差
 *
 * @author Unicorn
 * @create 2019-07-08 11:21
 */
public class TestStep2 {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        System.out.println(f(40));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }

        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            //最后走2步 + 最后走1步的走法
            sum = two + one;
            two = one;
            one = sum;
        }

        return sum;
    }
}
