package com.kl.dubbotest.jdkspi;

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
