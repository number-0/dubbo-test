package com.kl.dubbotest.dubbospi;

/**
 * @author songhengliang
 * @date 2019/6/27
 */
public class Dog implements Animal {

    @Override
    public void say() {
        System.out.println("小狗");
    }
}
