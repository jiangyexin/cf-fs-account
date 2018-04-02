package com.jyx.observer;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-04-02 16:11
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherSubject, 1);
        CurrentConditionDisplay display2 = new CurrentConditionDisplay(weatherSubject, 2);
        weatherSubject.measurementsChanged();
        weatherSubject.setMeasurements(36.5F,98,77);
        boolean flag;
        System.out.println("循环开始");
        for (int i = 0; i < 10; i++) {
            System.out.println("---------------    " + i + "     -----------------");
            flag = i%2 == 0;
            if (flag) {
                display1.cancelObserver();
            } else {
                display2.cancelObserver();
            }
            weatherSubject.measurementsChanged();
            if (!weatherSubject.isObserver(display1)) {
                display1.addObserver();
            }
            if (!weatherSubject.isObserver(display2)) {
                display2.addObserver();
            }
        }
        System.out.println("循环结束");
    }
}
