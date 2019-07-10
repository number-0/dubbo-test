package com.kl.dubbotest.provider.export;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author songhengliang
 * @date 2019/7/4
 */
public class ProviderExportTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");

        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    
}
