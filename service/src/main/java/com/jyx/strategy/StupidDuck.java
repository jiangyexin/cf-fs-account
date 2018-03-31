package com.jyx.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiangyexin
 * Date: 2018-03-31
 * Time: 22:43
 */
public class StupidDuck extends AbstractDuck {

    public StupidDuck() {
        this.flyBehavior = new BFlyBehavior();
    }

    public void display() {
        System.out.println("StupidDuck display;");
    }

}
