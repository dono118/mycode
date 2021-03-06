package com.icode.interview.designpattern.observer.forcast;

/**
 * @author Unicorn
 * @create 2019-09-29 20:23
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
