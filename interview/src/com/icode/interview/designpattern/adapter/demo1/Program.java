package com.icode.interview.designpattern.adapter.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 19:50
 */
public class Program {
    // 需求:
    // 电脑USB接口, 手机Type-C接口
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();

        // 电脑通过转接器(适配器)来连接到了一个TypeC手机
        computer.connect(new Adapter(phone));

        computer.showInfo();
    }
}
