package com.kl.dubbotest.dubbospi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author songhengliang
 * @date 2019/6/27
 */
@SPI
public interface Animal {

    void say();

}
