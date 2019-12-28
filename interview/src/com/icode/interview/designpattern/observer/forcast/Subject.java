package com.icode.interview.designpattern.observer.forcast;

/**
 * @author Unicorn
 * @create 2019-09-29 20:23
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
