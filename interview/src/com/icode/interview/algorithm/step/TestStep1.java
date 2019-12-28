package com.icode.interview.algorithm.step;

import org.junit.Test;

/**
 * 有n步台阶,一次只能上1步或2步,共有多少种走法?
 * 递归:
 *  优点: 代码简洁,可读性强
 *  缺点: 消耗内存大,效率低
 *
 * @author Unicorn
 * @create 2019-07-08 11:21
 */
public class TestStep1 {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        System.out.println(f(40));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //实现f(n): 求n步台阶,共有几张走法
    private int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 2) + f(n - 1);
    }
}
