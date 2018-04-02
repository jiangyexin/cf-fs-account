package com.jyx.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-04-02 15:48
 **/
public class WeatherSubject implements ISubject {
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherSubject() {
        this.observers = new LinkedList<IObserver>();
    }

    public synchronized void registerObserver(IObserver o) {
        this.observers.add(o);
    }

    public synchronized void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public boolean isObserver(IObserver o) {
        return observers.indexOf(o) >= 0;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
