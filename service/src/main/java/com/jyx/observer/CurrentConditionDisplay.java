package com.jyx.observer;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-04-02 16:03
 **/
public class CurrentConditionDisplay implements IObserver, IDisplayElement {
    private ISubject weatherSubject;
    private int id;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(ISubject subject, int i) {
        this.id = i;
        this.weatherSubject = subject;
        weatherSubject.registerObserver(this);
    }

    public void cancelObserver() {
        weatherSubject.removeObserver(this);
    }

    public void addObserver() {
        weatherSubject.registerObserver(this);
    }

    public void display() {
        System.out.println("CurrentConditionDisplay ID{" + id + "} Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
