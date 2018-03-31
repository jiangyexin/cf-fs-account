package com.jyx.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiangyexin
 * Date: 2018-03-31
 * Time: 22:37
 */
public class WildDuck extends AbstractDuck {
    public WildDuck() {
        this.flyBehavior = new AFlyBehavior();
    }

    public void display() {
        System.out.println("WildDuck display!");
    }
}
