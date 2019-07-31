package com.kl.dubbotest.serviceinvoke.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author songhengliang
 * @date 2019/7/29
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        Random random = new Random();
        try {
            Thread.sleep(1000 * random.nextInt(6));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
                        + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext()
                .getLocalAddress();
    }
}
