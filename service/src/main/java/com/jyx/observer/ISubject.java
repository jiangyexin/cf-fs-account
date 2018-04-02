package com.jyx.observer;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-04-02 15:41
 **/
public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
