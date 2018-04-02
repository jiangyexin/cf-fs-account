package com.jyx.observer;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-04-02 15:43
 **/
public interface IObserver {
    void update(float temperature, float humidity, float pressure);
}
