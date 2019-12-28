package com.icode.interview.designpattern.adapter.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 19:56
 */
public class Phone implements TypeC {
    @Override
    public String getInfo() {
        return "这是一个手机";
    }
}
