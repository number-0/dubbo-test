package com.kl.dubbotest.serviceinvoke;

import com.kl.dubbotest.serviceinvoke.provider.DemoService;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songhengliang
 * @date 2019/7/29
 */
public class ServiceInvokeTest {

    @Test
    public void provider() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        DemoService demoService = context.getBean(DemoService.class);

        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void consumer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        DemoService demoService = context.getBean(DemoService.class);

        for (;;) {
            System.out.println(demoService.sayHello("mydubbodebug"));

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void serviceinvoke() {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");
        DemoService demoService = context.getBean(DemoService.class);

        for (;;) {
            System.out.println(demoService.sayHello("mydubbodebug"));

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
