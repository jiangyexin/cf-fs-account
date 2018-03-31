package com.jyx.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiangyexin
 * Date: 2018-03-31
 * Time: 22:45
 */
public class MainStrategy {
    public static void main(String[] args) {
        StupidDuck stupidDuck  = new StupidDuck();
        WildDuck wildDuck = new WildDuck();
        stupidDuck.display();
        stupidDuck.fly();
        wildDuck.display();
        wildDuck.fly();
    }
}
