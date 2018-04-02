package com.jyx.test;

/**
 * @author: jiangyexin
 * @Description:
 * @Date: 2018-03-26 20:46
 **/
public class ThreadLoaclStudy {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        local.set("study");
    }
}
