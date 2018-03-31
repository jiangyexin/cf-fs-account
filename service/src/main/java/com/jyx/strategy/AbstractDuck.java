package com.jyx.strategy;

import jdk.nashorn.internal.ir.IfNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiangyexin
 * Date: 2018-03-31
 * Time: 22:28
 */
public abstract class AbstractDuck {
    IFlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
