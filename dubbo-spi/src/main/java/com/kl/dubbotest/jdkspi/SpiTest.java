package com.kl.dubbotest.jdkspi;

import java.util.ServiceLoader;

/**
 * @author songhengliang
 * @date 2019/7/2
 */
public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
        for (Animal animal: serviceLoader){
            animal.say();
        }
    }
}
